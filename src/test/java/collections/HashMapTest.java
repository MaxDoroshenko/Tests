package collections;
import java.util.*;
public class HashMapTest {

        public static void main(String args[]){
            Map<Integer,String> map = new HashMap<>();
            map.put(1,"Один");
            map.put(2,"Два");
            map.put(3,"Три");
            map.put(4,"Четыре");

            System.out.println("Hashmap:");
            for(Map.Entry m : map.entrySet()){
                System.out.println(m.getKey() + " " + m.getValue());
            }

            //Другой вариант реализации
            /*HashMap map = new HashMap();
            map.put("1","Один");
            map.put(2,"Два");
            map.put("Three", "Три");
            map.put(4,"Четыре");
            map.put("qwerty", 12345);
            System.out.println("HashMap:");
            for(Object m : map.entrySet() ){
                System.out.println(m);
            }*/
        }
}
