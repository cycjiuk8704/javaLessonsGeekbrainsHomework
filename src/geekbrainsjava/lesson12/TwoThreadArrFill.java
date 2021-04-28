package geekbrainsjava.lesson12;

public class TwoThreadArrFill extends Thread implements Runnable {

    private final float[] arr;
    private final boolean isFirstHalf;


    public TwoThreadArrFill(float[] arr, boolean isFirstHalf) {
        this.arr = arr;
        this.isFirstHalf = isFirstHalf;
    }

    @Override
    public void run() {
        int size = arr.length / 2;
        float[] arrHalf = new float[size];
        if (isFirstHalf) {
            System.arraycopy(arr, 0, arrHalf, 0, size);
            for (int i = 0; i < size; i++) {
                arrHalf[i] = Calculator.calculateFormula(arrHalf[i], i);
            }
            System.arraycopy(arrHalf, 0, arr, 0, size);
        } else {
            System.arraycopy(arr, size, arrHalf, 0, size);
            for (int i = 0; i < size; i++) {
                arrHalf[i] = Calculator.calculateFormula(arrHalf[i], i + size);
            }
            System.arraycopy(arrHalf, 0, arr, size, size);
        }

    }
}