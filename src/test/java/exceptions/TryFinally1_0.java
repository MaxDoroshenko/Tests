package exceptions;

public class TryFinally1_0 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            System.out.println("Результат деления = " + division(a, b));
        }
        finally {
            System.out.println("Код блока finally");
        }

    }
    public static float division (int a, int b) throws ArithmeticException{
        if ( b == 0) throw new ArithmeticException();
        return (float)a/(float)b;
    }
}
