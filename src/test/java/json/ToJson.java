package json;

import javax.json.Json;

import javax.json.JsonObject;

public class ToJson {
    public static void main(String[] args) {

        JsonObject jo = Json.createObjectBuilder()
                .add("a", "aaa")
                .add("b", "bbb")
                .build();
    }
}
