package typesOfData;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       //-------------------------Посчитать среднее арифметическое массива-----------------------

        System.out.print("Введите размер массива: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();                    //Определение размера массива
        int[] array = new int[size];                //

        for (int i = 0; i < size; i++)
        {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");   //Заполнение массива
            array[i] = in.nextInt();                                           //
        }
        averageOfArray av = new averageOfArray();
        av.average(array);                                          //Вызов метода рассчета среднего арифметического

        try {                                                       //
            Thread.sleep(1000);                               //Пауза между заданиями
        } catch (InterruptedException e) {                          //
            e.printStackTrace();                                    //
        }
        //-------------------------Посчитать факториал числа-----------------------
        System.out.println("Введите число для вычисления факториала: ");
        int factorial = in.nextInt();
    }
}
