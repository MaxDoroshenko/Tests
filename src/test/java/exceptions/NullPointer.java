package exceptions;

public class NullPointer {
    public static void main(String[] args) {
        try {
            Method();
        }
        catch (Exception e){
            System.out.println("NullPointer exception!");
        }
    }
    public static void Method() throws NullPointerException{
        //throw new NullPointerException();
        ((Object) null).toString();
    }
}
