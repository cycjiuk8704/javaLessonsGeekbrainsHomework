package lesson14;

import geekbrainsjava.lesson14.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ArrayUtilsTest {

    @Test
    public void testModifyArr1() throws IOException {
        int[] expectedArray = new int[]{5, 3, 2, 1, 2};
        int[] actualArray = new int[]{1, 3, 7, 4, 5, 3, 2, 1, 2};
        Assertions.assertArrayEquals(expectedArray, ArrayUtils.modifyArray(actualArray));
    }

    @Test
    public void testModifyArr2() throws IOException {
        int[] expectedArray = new int[]{1, 2};
        int[] actualArray = new int[]{1, 3, 7, 4, 5, 3, 4, 1, 2};
        Assertions.assertArrayEquals(expectedArray, ArrayUtils.modifyArray(actualArray));
    }

    @Test
    public void testModifyArr3() throws IOException {
        int[] expectedArray = new int[]{0};
        int[] actualArray = new int[]{1, 3, 7, 4, 5, 3, 4, 1, 2, 4};
        Assertions.assertArrayEquals(expectedArray, ArrayUtils.modifyArray(actualArray));
    }

    @Test
    public void testModifyArr4() {
        int[] actualArray = new int[]{1, 3, 7, 3, 5, 3, 42, 1, 2, 1};
        Assertions.assertThrows(RuntimeException.class, () -> ArrayUtils.modifyArray(actualArray));
    }


    @Test
    public void testAnalyzeArr1() throws IOException {
        int[] actualArray = new int[]{1, 1, 1, 4, 4, 1, 1, 1, 4};
        Assertions.assertTrue(ArrayUtils.analyseArray(actualArray));
    }

    @Test
    public void testAnalyzeArr2() throws IOException {
        int[] actualArray = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};
        Assertions.assertFalse(ArrayUtils.analyseArray(actualArray));
    }

    @Test
    public void testAnalyzeArr3() throws IOException {
        int[] actualArray = new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4};
        Assertions.assertFalse(ArrayUtils.analyseArray(actualArray));
    }

    @Test
    public void testAnalyzeArr4() {
        int[] actualArray = new int[]{1, 1, 1, 4, 4, 2, 1, 1, 4};
        Assertions.assertThrows(RuntimeException.class, () -> ArrayUtils.analyseArray(actualArray));
    }


}
