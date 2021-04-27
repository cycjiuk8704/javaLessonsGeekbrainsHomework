package geekbrainsjava.lesson12;


public class Main {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;
    static float[] arr = new float[SIZE];

    public static void main(String[] args) {
        OneThreadArrFill.fillFullArray();
        long fillingTime = System.currentTimeMillis();
        TwoThreadArrFill.fillArrByHalfs();
        TwoThreadArrFill secondThread = new TwoThreadArrFill();
        secondThread.start();
        System.out.println(System.currentTimeMillis() - fillingTime);
        try {
            secondThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int getHALF() {
        return HALF;
    }

    public static float[] getArr() {
        return arr;
    }
}
