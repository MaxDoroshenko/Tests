package cycles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число для рассчета факториала: ");
        int b = scan.nextInt();
        System.out.printf("Факториал числа !%s = %s", b, factorial(b));

        System.out.print("\n\nВведите число а: ");
        int a = scan.nextInt();
        beforeAfter(a);

        int[] array = new int[10];
        //Заполнение массива рандомными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 11);
        }
        System.out.print("\n\nСгенерированный массив: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        check(array);
    }

    public static long factorial(int b) {
        long result = 1;
        for (int i = 1; i <= b; i++)
            result *= i;
        return result;
    }

    public static void beforeAfter(int a) {
        int b = a;
        System.out.println("Цикл с постусовием:");
        do {
            System.out.print(a);
            if (a > 10)
                System.out.print(", ");
            else
                System.out.println(".");
            a--;
        } while (a >= 10);

        System.out.println("\nЦикл с предусовием:");
        while (b >= 10) {
            System.out.print(b);
            if (b > 10)
                System.out.print(", ");
            else
                System.out.println(".");
            b--;
        }
    }
    
    public static void check (int[] array) {
        System.out.print("\nВывод 5, если имеется в массиве: ");
        for (int i : array) {
            if (i == 5)
                System.out.print(i + " ");
        }
    }
}
