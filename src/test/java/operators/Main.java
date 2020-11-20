package operators;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("МЕНЮ:\n1.Запуск.\n0.Выход.\nВведите значение: ");
            while (!scan.hasNextInt()) {
                System.out.print("ОШИБКА: Введите 1 или 0!\n\nМЕНЮ:\n1.Запуск.\n0.Выход.\nВведите значение: ");
                scan.next();
            }
            int menu = scan.nextInt();
            switch (menu) {
                case(1): {
                    byte time = inputTime(scan);
                    int money = inputMoney(scan);
                    if (time >= 8 && time <= 12 && money > 10)
                        System.out.print("Идём в магазин!\n\n");
                    else if (time > 12 && time < 19 && money >= 50)
                        System.out.print("Идём в кафе!\n\n");
                    else if (time >=8 && time <= 19 && money < 50)
                        System.out.print("Идём к соседу!\n\n");
                    else if (time > 19 && time < 22)
                        System.out.print("Смотрим телевизор!\n\n");
                    else if ((time >= 22 && time <= 23) || (time >= 0 && time < 8))
                        System.out.print("Идём спать!\n\n");
                    break;
                }
                case(0): return;
                default: {System.out.print("ОШИБКА: Введите 1 или 0!\n\n");break;}
            }
        }
    }

    public static byte inputTime(Scanner scan) {
        byte time = -1;
        System.out.print("Введите значение ВРЕМЯ: ");
        //Валидация параметра ВРЕМЯ на тип byte и диапазон 0-23
        while (time < 0 || time > 23) {
            while (!scan.hasNextByte()) {
                System.out.print("ОШИБКА: Параметр ВРЕМЯ не соответствует числовому диапазону!\nПовторите ввод: ");
                scan.next();
            }
            time = scan.nextByte();
            if (time < 0 || time > 23) {
                System.out.print("ОШИБКА: Параметр ВРЕМЯ не соответствует диапазону 0-23!\nПовторите ввод: ");
            }
        }
        return time;
    }

    public static int inputMoney(Scanner scan) {
        int money = -1;
        System.out.print("Введите значение ДЕНЬГИ: ");
        //Валидация параметра ДЕНЬГИ на тип int и неотрецательное число
        while (money < 0) {
            while (!scan.hasNextInt()) {
                System.out.print("ОШИБКА: Параметр ДЕНЬГИ не соответствует числовому диапазону!\nПовторите ввод: ");
                scan.next();
            }
            money = scan.nextInt();
            if (money < 0) {
                System.out.print("ОШИБКА: Параметр ДЕНЬГИ отрицательный!\nПовторите ввод: ");
            }
        }
        return money;
    }
}
