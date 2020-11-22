package collections;
import java.util.*;

public class SetTest {
    public static void main(String[] args) {

        HashSet<Integer> myHashSet = new HashSet<>();

        myHashSet.add(1);
        myHashSet.add(1);

        for (int i : myHashSet)
            System.out.println(i);

    }
}
