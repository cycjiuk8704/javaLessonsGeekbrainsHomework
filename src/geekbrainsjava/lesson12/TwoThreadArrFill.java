package geekbrainsjava.lesson12;

public class TwoThreadArrFill extends Thread implements Runnable {

    private final int size;
    private final float[] arr;
    private final boolean isFirstHalf;


    public TwoThreadArrFill(float[] arr, int size, boolean isFirstHalf) {
        this.arr = arr;
        this.size = size;
        this.isFirstHalf = isFirstHalf;
    }

    @Override
    public void run() {
        float[] arrHalf = new float[size];
        if (isFirstHalf) {
            System.arraycopy(arr, 0, arrHalf, 0, size);
        } else {
            System.arraycopy(arr, size, arrHalf, 0, size);
        }
        Calculator.calculateFormula(arrHalf);
        if (isFirstHalf) {
            System.arraycopy(arrHalf, 0, arr, 0, size);
        } else {
            System.arraycopy(arrHalf, 0, arr, size, size);
        }
    }
}