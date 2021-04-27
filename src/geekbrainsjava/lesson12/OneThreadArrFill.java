package geekbrainsjava.lesson12;

import java.util.Arrays;

public class OneThreadArrFill {
    public static void fillFullArray() {
        float[] arr = Main.getArr();
        Arrays.fill(arr, 1.0f);
        long fillingTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - fillingTime);
    }
}
