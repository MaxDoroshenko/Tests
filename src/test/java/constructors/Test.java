package constructors;

public class Test {

    Test(){
        System.out.println(Test.class.toString());
    }
    Test(String name){
        System.out.println(Test.class.toString() + " by " + name);
    }

    public static void main(String[] args) {
        Test a = new Test();
        Test b = new Test("Maksym");
    }
}
