package modificators;

public class ClassC {
    public static void main(String[] args) {
        ClassA A = new ClassA();
        A.publicMethod();
        A.packagePrivateMethod();
    }

    public static void publicMethodC(){System.out.println("Public static method from class C");}
}
