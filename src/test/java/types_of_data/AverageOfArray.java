package types_of_data;

public class AverageOfArray {
    public static float average(int[] array) {

        float result = 0;
        for (int i = 0; i < array.length; i++)
        {
            result += array[i];
        }
        result = result/array.length;
        return result;
    }
}
