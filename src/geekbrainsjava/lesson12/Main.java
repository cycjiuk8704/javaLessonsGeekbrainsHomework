package geekbrainsjava.lesson12;


import java.util.Arrays;

public class Main {
    static final int SIZE = 10;

    public static void main(String[] args) {

        float[] arr = new float[SIZE];
        OneThreadArrFill.fillFullArray(arr);

        long fillingTime = System.currentTimeMillis();
        TwoThreadArrFill firstThread = new TwoThreadArrFill(arr, true);
        TwoThreadArrFill secondThread = new TwoThreadArrFill(arr, false);
        firstThread.start();
        secondThread.start();
        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Время выполнения в двух потоках, мс : " + (System.currentTimeMillis() - fillingTime));
        for (float v : arr) {
            System.out.print(v + " ");
        }

        Arrays.fill(arr, 1.0f);

        fillingTime = System.currentTimeMillis();
        TwoThreadArrFillNoCopy firstNoCopyThread = new TwoThreadArrFillNoCopy(arr, true);
        TwoThreadArrFillNoCopy secondNoCopyThread = new TwoThreadArrFillNoCopy(arr, false);
        try {
            firstNoCopyThread.join();
            secondNoCopyThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Время выполнения в двух потоках без копирования массива, мс : " + (System.currentTimeMillis() - fillingTime));
        for (float v : arr) {
            System.out.print(v + " ");

        }

    }
}
