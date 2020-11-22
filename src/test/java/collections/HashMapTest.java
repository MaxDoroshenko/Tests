package collections;
import java.util.*;
public class HashMapTest {

        public static void main(String args[]){
            HashMap<Integer,String> map = new HashMap<>();
            map.put(1,"Один");  //Put elements in Map
            map.put(2,"Два");
            map.put(3,"Три");
            map.put(4,"Четыре");

            System.out.println("Hashmap:");
            for(Map.Entry m : map.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
            }
        }
}
