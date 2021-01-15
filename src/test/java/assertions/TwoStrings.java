package assertions;

import org.junit.Assert;
import org.junit.Test;

public class TwoStrings {
    @Test
    public void compareTwoStrings(){
        String a = "String";
        Assert.assertEquals("Строки не совпадают", a, "String");
    }
}
