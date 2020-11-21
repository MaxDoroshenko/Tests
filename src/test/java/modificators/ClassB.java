package modificators;

public class ClassB extends ClassA {
    public static void main(String[] args) {
        ClassB B = new ClassB();
        B.publicMethod();
        B.protectedMethod();
        ClassC.publicMethodC();
    }
}
