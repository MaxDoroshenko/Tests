package assertions;

import org.junit.Assert;
import org.junit.Test;

public class TwoStringContains {
    @Test
    public void partialComparingTwoStrings(){
        String a = "Hello";
        String b = "Hello World!";
        Assert.assertTrue("Строка b не содержит строку a", b.contains(a));
    }
}
