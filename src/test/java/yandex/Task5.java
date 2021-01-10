package yandex;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class Task5 {
    @Test
    @DisplayName("Задание 5")
    public void task5() {
        RestAssured.baseURI ="https://cloud-api.yandex.net/v1/disk";
        RequestSpecification request = given();
        //Создание папки test
        given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                put("/resources?path=/test").
                then().
                statusCode(201);

        //Создание папки foo
        given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                put("/resources?path=/test/foo").
                then().
                statusCode(201);

        //Создание файла autotest в папке(копирование имеющегося)
        given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                post("/resources/copy?from=/test.docx&path=/test/foo/autotest.docx").
                then().
                statusCode(201);

        //Получение метаданных папки test
        given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                get("/resources?path=/test").
                then().
                statusCode(200).body("type", equalTo("dir"));



        //Удаление папки test
        given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                delete("/resources?path=/test").
                then().
                statusCode(202);

        //Проверка удаления
        given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                get("/resources?path=/test").
                then().
                statusCode(404);
    }
}
