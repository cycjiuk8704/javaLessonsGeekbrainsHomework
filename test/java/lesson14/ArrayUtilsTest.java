package lesson14;

import geekbrainsjava.lesson14.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {

    private ArrayUtils arrayUtils;

    @Test
    public void testModifyArr1() {
        int[] expectedArray = new int[]{1, 2};
        int[] actualArray = new int[]{1, 3, 7, 4, 5, 3, 4, 1, 2};
        Assertions.assertArrayEquals(expectedArray, ArrayUtils.arrModifier(actualArray));
    }

    @Test
    public void testModifyArr2() {
        int[] expectedArray = new int[]{0};
        int[] actualArray = new int[]{1, 3, 7, 4, 5, 3, 4, 1, 2, 4};
        Assertions.assertArrayEquals(expectedArray, ArrayUtils.arrModifier(actualArray));
    }

    @Test
    public void testModifyArr3() {
        int[] expectedArray = new int[]{0};
        int[] actualArray = new int[]{1, 3, 7, 3, 5, 3, 42, 1, 2, 1};
        Assertions.assertThrows(RuntimeException.class, () -> {
            ArrayUtils.arrModifier(actualArray);
        });
    }


}
