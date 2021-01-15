package assertions;

import org.junit.Assert;
import org.junit.Test;

public class TwoNumbers {
    @Test
    public void compareTwoNumbers(){
        int a = 1;
        int b = 1;
        Assert.assertEquals( "Числа не совпадают", a, b);
    }
}
