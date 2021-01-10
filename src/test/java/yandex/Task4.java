package yandex;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static io.restassured.RestAssured.given;

public class Task4 {
    @Test
    @DisplayName("Задание 4")
    public void task4() {
        RestAssured.baseURI ="https://cloud-api.yandex.net/v1/disk";
        RequestSpecification request = given();

        //Получение информации о диске
        Response response = given().
                    header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                    get().
                then().
                    statusCode(200).
                extract().
                    response();
        //Получение размера всех файлов в корзине
        float firstTrashSize = response.jsonPath().getFloat("trash_size");
        System.out.println("Изначальный размер файлов в корзине: " + firstTrashSize + " bytes");

        //Создание папки
        given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                put("/resources?path=/mdoroshenko").
                then().
                statusCode(201);

        //Создание файлов в папке(копирование имеющегося)
        given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                post("/resources/copy?from=/test.docx&path=/mdoroshenko/test.docx").
                then().
                statusCode(201);
        given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                post("/resources/copy?from=/test.docx&path=/mdoroshenko/test1.docx").
                then().
                statusCode(201);

        //Удаление созданных файлов
        given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                delete("/resources?path=/mdoroshenko/test.docx").
                then().
                statusCode(204);
        given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                delete("/resources?path=/mdoroshenko/test1.docx").
                then().
                statusCode(204);

        //Получение информации о диске
        Response response1 = given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                get().
                then().
                statusCode(200).
                extract().
                response();
        //Получение размера всех файлов в корзине
        float secondTrashSize = response1.jsonPath().getFloat("trash_size");
        System.out.println("Конечный размер файлов в корзине: " + secondTrashSize + " bytes");

        //Получение размера первого файла
        Response response2 = given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                get("/trash/resources?path=/test.docx").
                then().
                statusCode(200).
                extract().
                response();
        float sizeOfFirstFile = response2.jsonPath().getFloat("size");
        System.out.println("Размер первого файла: " + sizeOfFirstFile + " bytes");

        //Получение размера второго файла
        Response response3 = given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                get("/trash/resources?path=/test1.docx").
                then().
                statusCode(200).
                extract().
                response();
        //Получение размера файлов в корзине
        float sizeOfSecondFile = response3.jsonPath().getFloat("size");
        System.out.println("Размер второго файла: " + sizeOfSecondFile + " bytes");

        try{
            comparing(firstTrashSize, secondTrashSize, sizeOfFirstFile, sizeOfSecondFile);
        }
         catch (Exception e) {
             System.out.println("Размер файлов в корзине != первоначальному разрамеру корзины + размеру файлов в корзине");
        }

        //Восстановление файлов из корзины
        given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                put("/trash/resources/restore?path=test.docx").
                then().
                statusCode(201);
        given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                put("/trash/resources/restore?path=test1.docx").
                then().
                statusCode(201);

        //Удаление созданной папки
        given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                delete("/resources?path=/mdoroshenko").
                then().
                statusCode(202);
    }

    public static void comparing(float firstTrashSize, float secondTrashSize, float sizeOfFirstFile, float sizeOfSecondFile)
    throws Exception{
        if (secondTrashSize == (firstTrashSize + sizeOfFirstFile + sizeOfSecondFile))
            System.out.println("Размер файлов в корзине = первоначальному разрамеру корзины + размеру файлов в корзине");
        else
            throw new Exception();
    }
}