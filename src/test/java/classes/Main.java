package classes;

public class Main {
    public static void main(String[] args) {
        Test getNameAndParemeter1 = new Test();
        Test getNameAndParemeter2 = new Test();
        String a = "Parameter1";
        String b = "Parameter2";
        System.out.println("Имя класса и параметр 1: " + getNameAndParemeter1.getNameOfClass(a));
        System.out.println("Имя класса и параметр 2: " + getNameAndParemeter2.getNameOfClass(b));
    }

}
