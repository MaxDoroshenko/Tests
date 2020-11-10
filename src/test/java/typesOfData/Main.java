package typesOfData;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       //--------------------------------Посчитать среднее арифметическое массива--------------------------------------
        System.out.println("------------------------Вычисление среднего арифметического массива----------------------");
        System.out.print("Введите размер массива: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();                    //Определение размера массива
        int[] array = new int[size];                //

        for (int i = 0; i < size; i++)
        {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");   //Заполнение массива
            array[i] = in.nextInt();                                           //
        }
        AverageOfArray av = new AverageOfArray();
        System.out.println("Среднее арифметическое массива = " + av.average(array)); //Вызов метода рассчета среднего арифметического




        try {                                                       //
            Thread.sleep(1000);                               //Пауза между заданиями
        } catch (InterruptedException e) {                          //
            e.printStackTrace();                                    //
        }

        //---------------------------------------Посчитать факториал числа--------------------------------------------
        System.out.println("\n-----------------------------Вычисление факториала числа-------------------------------");
        System.out.print("Введите число для вычисления факториала: ");
        int factorial = in.nextInt();
        Factorial f = new Factorial();
        System.out.printf("Факториал числа !%s = %s", factorial, f.factorial(factorial));
    }
}
