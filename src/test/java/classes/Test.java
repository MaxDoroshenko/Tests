package classes;

public class Test {
    public static String getNameOfClass(String a) {
        String name = Test.class.getSimpleName();
        String result = name + a;
        return result;
    }

}
