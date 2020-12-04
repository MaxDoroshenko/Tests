package generic;

public class Test<T> {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.generic();
    }
    public void generic(){
        T value;             //переменная с определенным типом
        int a = 10;
        System.out.println(func(a));
        String b = "Строка";
        System.out.println(func(b));
    }
    public static <T> T func(T value){                     //метод с возможностью генерирования, в котором можно
        return value;                                      // менять тип  данных для генерации
    }
}
