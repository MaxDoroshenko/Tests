package collections;
import java.util.*;

public class SetTest {
    public static void main(String[] args) {

        Set<Integer> myHashSet = new HashSet<>();

        myHashSet.add(1);
        myHashSet.add(1);

        for (int i : myHashSet)
            System.out.println(i);

        //-----------Другой вариант реализации
        /*Collection myHashSet2 = new HashSet();
        //Set myHashSet2 = new HashSet();
        myHashSet2.add(1);
        myHashSet2.add(1);

        for(Object i : myHashSet2)
            System.out.println(i);*/


    }
}
