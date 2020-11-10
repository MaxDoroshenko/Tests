package typesOfData;

public class Factorial {
    public static int factorial(int f)
    {
        int result = 1;
        for(int i = 1; i <= f; i++)
        {
            result *= i;
        }
        return result;
    }
}
