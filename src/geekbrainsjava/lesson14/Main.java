package geekbrainsjava.lesson14;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[]{1, 3, 7, 2, 5, 1, 2, 1, 2};
        int[] arr14 = new int[]{1, 2, 1, 4, 1, 1, 1};
        System.out.println(ArrayUtils.modifyArray(arr));
        System.out.println(ArrayUtils.analyseArray(arr14));
    }
}
