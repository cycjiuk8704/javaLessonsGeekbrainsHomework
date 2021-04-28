package geekbrainsjava.lesson12;


import java.util.Arrays;

public class Main {
    static final int SIZE = 10_000_000;

    public static void main(String[] args) {

        float[] arr = new float[SIZE];
        OneThreadArrFill.fillFullArray(arr);

        long fillingBeginTime = System.currentTimeMillis();
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
        System.out.println("Время выполнения в двух потоках, мс : " + (System.currentTimeMillis() - fillingBeginTime));

        Arrays.fill(arr, 1.0f);

        fillingBeginTime = System.currentTimeMillis();
        TwoThreadArrFillNoCopy firstNoCopyThread = new TwoThreadArrFillNoCopy(arr, true);
        TwoThreadArrFillNoCopy secondNoCopyThread = new TwoThreadArrFillNoCopy(arr, false);
        firstNoCopyThread.start();
        secondNoCopyThread.start();
        try {
            firstNoCopyThread.join();
            secondNoCopyThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Время выполнения в двух потоках без копирования массива, мс : " + (System.currentTimeMillis() - fillingBeginTime));

    }
}
