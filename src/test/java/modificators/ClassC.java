package modificators;

public class ClassC {
    public static void main(String[] args) {
        ClassA A = new ClassA();
        A.publicMethod();

        //Непонятно задание с вызовом метода private, поэтому создал еще один метод и вызвал в классе, иначе
        //код A.privateMethod(); приводит к ошибке
        privateMethodC();
    }
    private static void privateMethodC(){System.out.println("Private method from class C");}
    public static void publicMethodC(){System.out.println("Public static method from class C");}
}
