package json;

import javax.json.Json;
import javax.json.JsonArray;

public class JsonToArray {
    public static void main(String[] args) {
        String[] array = new String[3];
        JsonArray jo = Json.createArrayBuilder()
                .add("Коля")
                .add("Вася")
                .add("Петя")
                .build();
        for(int i = 0; i < 3; i++){
            array[i]= jo.getString(i);
        }
        for (int j = 0; j < 3; j++){
            System.out.println(array[j]);
        }
    }
}

