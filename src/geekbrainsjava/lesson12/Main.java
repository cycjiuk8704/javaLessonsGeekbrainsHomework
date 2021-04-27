package geekbrainsjava.lesson12;


public class Main {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {

        float[] arr = new float[SIZE];
        OneThreadArrFill.fillFullArray(arr);

        long fillingTime = System.currentTimeMillis();
        TwoThreadArrFill firstThread = new TwoThreadArrFill(arr, HALF, true);
        TwoThreadArrFill secondThread = new TwoThreadArrFill(arr, HALF, false);
        firstThread.start();
        secondThread.start();
        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Время выполнения в двух потоках, мс : " + (System.currentTimeMillis() - fillingTime));
    }

    }
