package geekbrainsjava.lesson12;


public class Main {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;
    static float[] arr = new float[SIZE];

    public static void main(String[] args) {
        OneThreadArrFill.fillFullArray();
        long fillingTime = System.currentTimeMillis();
        TwoThreadArrFill secondThread = new TwoThreadArrFill();
        secondThread.start();
        TwoThreadArrFill.fillArrByHalfs();
        try {
            secondThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Время выполнения в двух потоках, мс : " + (System.currentTimeMillis() - fillingTime));
    }

    public static int getHALF() {
        return HALF;
    }

    public static int getSIZE() {
        return SIZE;
    }

    public static float[] getArr() {
        return arr;
    }
}
