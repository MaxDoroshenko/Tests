package typesOfData;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Меню:\n1.Посчитать среднее арифметическое массива.\n2.Посчитать факториал числа");
        System.out.println("3.Вывести цену товара.\n4.Проверка на чётное/нечётное.\n5.Массив в строку и обратно." );
        System.out.println("6.Добавление слова \"hello\" к каждому элементу массива.\n7.Преобразование числового массива в boolean" );
        System.out.print("8.DEMO\nВведите пункт меню: ");
        int a = in.nextInt();
        switch(a){
            case(1):
                calculateAverage(in);
                break;
            case(2):
                calculateFactorial(in);
                break;
            case(3):
                viewPrices(in);
                break;
            case(4):
                checkEvenOdd(in);
                break;
            default:
                System.out.println("Неверный номер пункта меню!");
                break;
        }

    }

    public static void calculateAverage(Scanner in)
    {
        //--------------------------------Посчитать среднее арифметическое массива--------------------------------------
        System.out.println("------------------------Вычисление среднего арифметического массива----------------------");
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();                    //Определение размера массива
        int[] array = new int[size];                //

        for (int i = 0; i < size; i++)
        {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");   //Заполнение массива
            array[i] = in.nextInt();                                           //
        }
        AverageOfArray av = new AverageOfArray();
        System.out.println("Среднее арифметическое массива = " + av.average(array)); //Вызов метода рассчета среднего арифметического
    }

    public static void calculateFactorial(Scanner in)
    {
        //---------------------------------------Посчитать факториал числа--------------------------------------------
        System.out.println("\n-----------------------------Вычисление факториала числа-------------------------------");
        System.out.print("Введите число для вычисления факториала: ");
        int factorial = in.nextInt();
        Factorial f = new Factorial();
        System.out.printf("Факториал числа !%s = %s", factorial, f.factorial(factorial)); //Вызов метода рассчета факториала
    }

    public static void viewPrices(Scanner in)
    {
        ////switch-case или массив?
    }

    public static void checkEvenOdd(Scanner in)
    {
        System.out.println("\n-------------------------------Проверка чётности числа---------------------------------");
        System.out.print("Введите целое число для проверки на чётность: ");
        int num = in.nextInt();
        EvenOdd even = new EvenOdd();
        if (even.checkEvenOdd(num) == true)
            System.out.println("Число чётное!");
        else
            System.out.println("Число нечётное!");
    }

    public static void demo(Scanner in)
    {
        calculateAverage(in);
        pause();
        calculateFactorial(in);
        pause();
        viewPrices(in);
        pause();
        checkEvenOdd(in);
        pause();
    }
    public static void pause()
    {
        try {                                                       //
            Thread.sleep(1000);                               //Пауза между заданиями
        } catch (InterruptedException e) {                          //
            e.printStackTrace();                                    //
        }
    }
}
