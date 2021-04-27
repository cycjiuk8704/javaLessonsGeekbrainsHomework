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
        if (isFirstHalf) {
            calcBegin = 0;
            calcEnd = arr.length / 2;
        } else {
            calcBegin = arr.length / 2;
            calcEnd = arr.length;
        }
        for (int i = calcBegin; i < calcEnd; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5.0f) * Math.cos(0.2f + i / 5.0f) * Math.cos(0.4f + i / 2.0f));
        }
    }
}
