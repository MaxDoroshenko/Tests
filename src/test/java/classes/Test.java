package classes;

public class Test {
    public static String getNameOfClass(String a) {
        //String name = Test.class.toString();  //-- по статье из лекции
        String name = Test.class.getSimpleName(); //-- более логичное решение
        String result = name + a; // Добавление параметра к имени класса
        return result;
    }

}
