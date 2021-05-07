package geekbrainsjava.lesson14;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static int[] arr = new int[]{1, 3, 7, 2, 5, 4, 2, 1, 2};
    public static int[] arr14 = new int[]{1, 1, 1, 4, 1, 1, 1};

    public static void main(String[] args) throws IOException {

        System.out.println(Arrays.toString(ArrayUtils.modifyArray(arr)));
        System.out.println(ArrayUtils.analyseArray(arr14));
    }
}
