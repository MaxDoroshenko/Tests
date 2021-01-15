package assertions;

import org.junit.Assert;
import org.junit.Test;

public class TwoArrays {
    @Test
    public void compareTwoArrays(){
        int[] a = new int[] {1, 2, 3};
        int[] b = new int[] {1, 2, 3};
        Assert.assertArrayEquals("Массивы не совпадают", a, b);
    }
}
