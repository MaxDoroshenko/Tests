package yandex;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static io.restassured.RestAssured.given;

public class TestTask3 {
    @Test
    @DisplayName("Задание 3")
    public void task3() throws InterruptedException {
        RestAssured.baseURI ="https://cloud-api.yandex.net/v1/disk";
        RequestSpecification request = given();

        //Создание папки
        given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                put("/resources?path=/mdoroshenko").
                then().
                statusCode(201);
        Thread.sleep(2000);
        //Создание файла в папке(копирование имеющегося)
        given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                post("/resources/copy?from=/test.docx&path=/mdoroshenko/test.docx").
                then().
                statusCode(201);
        Thread.sleep(2000);
        //Удаление созданного файла
        given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                delete("/resources?path=/mdoroshenko/test.docx").
                then().
                statusCode(204);
        Thread.sleep(2000);
        //Восстановление файла из корзины
        given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                put("/trash/resources/restore?path=test.docx").
                then().
                statusCode(201);
        Thread.sleep(2000);

        //Удаление созданной папки
        given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                delete("/resources?path=/mdoroshenko").
                then().
                statusCode(202);
        Thread.sleep(2000);
    }
}