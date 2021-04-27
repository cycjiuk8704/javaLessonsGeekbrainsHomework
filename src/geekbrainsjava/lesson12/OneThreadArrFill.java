package geekbrainsjava.lesson12;

import java.util.Arrays;

public class OneThreadArrFill {

    public static void fillFullArray(float[] arr) {
        Arrays.fill(arr, 1.0f);
        long fillingTime = System.currentTimeMillis();
        Calculator.calculateFormula(arr);

        System.out.println("Время выполнения в одном потоке, мс : " + (System.currentTimeMillis() - fillingTime));
        for (float v : arr) {
            System.out.print(v + " ");
        }
        Arrays.fill(arr, 1.0f);
    }
}
