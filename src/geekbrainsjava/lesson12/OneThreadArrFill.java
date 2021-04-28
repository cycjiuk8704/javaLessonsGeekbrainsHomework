package geekbrainsjava.lesson12;

import java.util.Arrays;

public class OneThreadArrFill {

    public static void fillFullArray(float[] arr) {
        Arrays.fill(arr, 1.0f);
        long fillingBeginTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Calculator.calculateFormula(arr[i], i);
        }


        System.out.println("Время выполнения в одном потоке, мс : " + (System.currentTimeMillis() - fillingBeginTime));
//        for (float v : arr) {
//            System.out.print(v + " ");
//        }
//        System.out.println();
        Arrays.fill(arr, 1.0f);
    }
}
