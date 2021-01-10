package yandex;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static io.restassured.RestAssured.given;

public class Task1 {
    @Test
    @DisplayName("Задание 1")
    public void task1() {
        RestAssured.baseURI ="https://cloud-api.yandex.net/v1/disk";
        RequestSpecification request = given();

        //Создание папки
        given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                put("/resources?path=/mdoroshenko").
                then().
                statusCode(201);

        //Удаление папки
        given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                delete("/resources?path=/mdoroshenko").
                then().
                statusCode(204);

        //Проверка удаления папки
        given().
                header("Authorization", "OAuth AgAAAAAdwzaYAADLW5zOpffTIUzFiusGDu3b8yQ").
                when().
                get("/resources?path=/mdoroshenko").
                then().
                statusCode(404);
    }
}
