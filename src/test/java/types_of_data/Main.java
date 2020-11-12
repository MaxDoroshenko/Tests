package types_of_data;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\nМеню:\n1.Посчитать среднее арифметическое массива.\n2.Посчитать факториал числа.");
            System.out.println("3.Вывести цену товара.\n4.Проверка на чётное/нечётное.\n5.Массив в строку и обратно." );
            System.out.println("6.Добавление слова \"hello\" к каждому элементу массива.\n7.Преобразование числового массива в boolean." );
            System.out.print("8.DEMO\n0.Выход.\nВведите пункт меню: ");
            int a = in.nextInt();
            switch(a) {
                case(1): {calculateAverage(in); break;}
                case(2): {calculateFactorial(in); break;}
                case(3): {viewPrices(in); break;}
                case(4): {checkEvenOdd(in); break;}
                case(5): {arrToString(in); break;}
                case(6): {addHello(in); break;}
                case(7): {intArrToBool(in); break;}
                case(8): {demo(in); break;}
                case(0): {return;}
                default: {System.out.println("Неверный номер пункта меню!"); break;}
            }
        }
    }

    public static void calculateAverage(Scanner in) {
        //--------------------------------Посчитать среднее арифметическое массива--------------------------------------
        System.out.println("\n------------------------Вычисление среднего арифметического массива----------------------");
        int[] array = inputArray(in);
        AverageOfArray av = new AverageOfArray();
        System.out.println("Среднее арифметическое массива = " + av.average(array)); //Вызов метода рассчета среднего арифметического
    }

    public static void calculateFactorial(Scanner in) {
        //---------------------------------------Посчитать факториал числа--------------------------------------------
        System.out.println("\n-----------------------------Вычисление факториала числа-------------------------------");
        System.out.print("Введите число для вычисления факториала: ");
        int factorial = in.nextInt();
        Factorial f = new Factorial();
        System.out.printf("Факториал числа !%s = %s\n\n", factorial, f.factorial(factorial)); //Вызов метода рассчета факториала
    }

    public static void viewPrices(Scanner in) {
        System.out.println("\n-------------------------Отображение цены товара по его коду---------------------------");
        int[][] products = {{1,100}, {2,100}, {3,200}, {4, 150}, {5, 500}};
        boolean flag = true;
        while(true){
            System.out.print("Введите код товара (для выхода введите 0):");
            int code = in.nextInt();
            switch (code) {
                case(1): {System.out.println("Цена выбранного товара: " + products[0][1]); break;}
                case(2): {System.out.println("Цена выбранного товара: " + products[1][1]); break;}
                case(3): {System.out.println("Цена выбранного товара: " + products[2][1]); break;}
                case(4): {System.out.println("Цена выбранного товара: " + products[3][1]); break;}
                case(5): {System.out.println("Цена выбранного товара: " + products[4][1]); break;}
                case(0): {return;}
                default: {System.out.println("Неверный код!"); break;}
            }
        }

    }

    public static void checkEvenOdd(Scanner in) {
        System.out.println("\n-------------------------------Проверка чётности числа---------------------------------");
        System.out.print("Введите целое число для проверки на чётность: ");
        int num = in.nextInt();
        EvenOdd even = new EvenOdd();
        if (even.checkEvenOdd(num) == true)
            System.out.println("Число чётное!");
        else
            System.out.println("Число нечётное!");
    }

    public static void arrToString(Scanner in) {
        System.out.println("\n------------Преобразование целочисленного массива в строку и обратно-------------------");
        ArrayToString ar = new ArrayToString();
        ar.arrayToString(inputArray(in));
    }

    public static void addHello(Scanner in) {
        AddHello add = new AddHello();
        add.addHelloToStr(in);
    }

    public static void intArrToBool(Scanner in) {
        System.out.println("\n----------------Преобразование целочисленного массива в boolean------------------------");
        int[] arr = inputArray(in);
        boolean[] arrB = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            //arrB[i] = arr[i];
            arrB[i] = (arr[i] != 0);
        }
        for (int i = 0; i < arrB.length; i++) {
            System.out.print(arrB[i]);
            if (i != (arrB.length - 1))
                System.out.print(", ");
            else
                System.out.println(".");
        }
    }
    public static void demo(Scanner in) {
        calculateAverage(in);
        pause();
        calculateFactorial(in);
        pause();
        viewPrices(in);
        pause();
        checkEvenOdd(in);
        pause();
        arrToString(in);
        pause();
        addHello(in);
        pause();
        intArrToBool(in);
    }
    public static void pause() {
        try {                                                       //
            Thread.sleep(1000);                               //Пауза между заданиями
        } catch (InterruptedException e) {                          //
            e.printStackTrace();                                    //
        }
    }

    public static int[] inputArray(Scanner in) {
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();                    //Определение размера массива
        int[] array = new int[size];                //
        for (int i = 0; i < size; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");   //Заполнение массива
            array[i] = in.nextInt();                                           //
        }
        return array;
    }
}
