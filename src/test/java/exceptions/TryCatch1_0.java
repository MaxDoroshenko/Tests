package exceptions;

public class TryCatch1_0 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            System.out.println("Результат деления = " + division(a, b));
        }
        catch (ArithmeticException e)
        {
            System.out.println("На ноль делить нельзя!");
        }

    }
    public static float division (int a, int b) throws ArithmeticException{
        if ( b == 0) throw new ArithmeticException();
        return (float)a/(float)b;
    }
}
