package typesOfData;

public class averageOfArray {
    public static void average(int[] array) {

        float result = 0;
        for (int i = 0; i < array.length; i++)
        {
            result += array[i];
        }
        System.out.println("Среднее арифметическое массива = " + result/array.length);
    }
}
