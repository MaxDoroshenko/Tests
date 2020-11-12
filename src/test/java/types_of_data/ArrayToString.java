package types_of_data;
import java.util.Arrays;

public class ArrayToString {
    public static void arrayToString(int[] array) {
        System.out.print("Введенный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != (array.length - 1))
                System.out.print(", ");
            else
                System.out.println(".");
        }
        String str = Arrays.toString(array).replaceAll("\\[|\\]|\\s", ""); //Преобразование int массива в string
        System.out.println("Полученная строка из массива: " + str);
        int[] numArr = Arrays.stream(str.split(",")).mapToInt(Integer::parseInt).toArray(); //Преобразование string обратно в int массив
        System.out.print("Полученный массив обратно из строки: ");
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
            if (i != (numArr.length - 1))
                System.out.print(", ");
            else
                System.out.println(".");
        }

        
    }
}
