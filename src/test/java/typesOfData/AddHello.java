package typesOfData;

import java.util.Scanner;

public class AddHello {
    public static void addHelloToStr(Scanner in) {
        System.out.println("\n----------Добавление слова \"hello\" к каждому элементу массива символо----------------");
        System.out.print("Введите размер массива символов: ");
        int size = in.nextInt();                    //Определение размера массива
        char[] array = new char[size];              //
        for (int i = 0; i < size; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");       //Заполнение массива
            array[i] = in.next().charAt(0);                                        //
        }
        System.out.print("Введенный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != (array.length - 1))
                System.out.print(", ");
            else
                System.out.println(".");
        }
        String[] str = new String[array.length];
        for(int i = 0; i < str.length; i++) {
            str[i] = array[i] + "hello";
            //str[i] = str[i].concat("hello");
        }
        System.out.print("Полученный массив: ");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
            if (i != (array.length - 1))
                System.out.print(", ");
            else
                System.out.println(".\n");
        }
    }
}
