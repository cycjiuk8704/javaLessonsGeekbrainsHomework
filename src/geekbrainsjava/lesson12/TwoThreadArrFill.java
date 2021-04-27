package geekbrainsjava.lesson12;

public class TwoThreadArrFill extends Thread implements Runnable {

    int size;
    float[] arr;
    boolean isFirstHalf;


    public TwoThreadArrFill(float[] arr, int size, boolean isNewThread) {
        this.arr = arr;
        this.size = size;
        this.isFirstHalf = isNewThread;
    }

    @Override
    public void run() {
        float[] arrHalf = new float[size];
        CalcClass.calculateFormula(arrHalf);
        if (isFirstHalf) {
            System.arraycopy(arrHalf, 0, arr, 0, size);
        } else {
            System.arraycopy(arrHalf, 0, arr, size, size);
        }
    }
}