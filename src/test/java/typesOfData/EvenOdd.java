package typesOfData;

public class EvenOdd {
    public static boolean checkEvenOdd(int num){
        boolean flag;
        if ( num % 2 == 0 )
            flag = true;
        else
            flag = false;
        return flag;
    }
}
