package geekbrainsjava.lesson12;

public class TwoThreadArrFillNoCopy extends Thread implements Runnable {
    private final float[] arr;
    private final boolean isFirstHalf;


    public TwoThreadArrFillNoCopy(float[] arr, boolean isFirstHalf) {
        this.arr = arr;
        this.isFirstHalf = isFirstHalf;
    }

    @Override
    public void run() {
        int calcBegin;
        int calcEnd;
        int halfSize = arr.length / 2;
        calcBegin = isFirstHalf ? 0 : halfSize;
        calcEnd = isFirstHalf ? halfSize : arr.length;
        for (int i = calcBegin; i < calcEnd; i++) {
            arr[i] = Calculator.calculateFormula(arr[i], i);
        }
    }
}
