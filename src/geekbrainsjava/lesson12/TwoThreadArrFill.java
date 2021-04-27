package geekbrainsjava.lesson12;

public class TwoThreadArrFill extends Thread implements Runnable {

    @Override
    public void run() {
        float[] arr = Main.getArr();
        int size = Main.getHALF();
        float[] arrHalf = new float[size];
        System.arraycopy(arr, size, arrHalf, 0, size);
        for (int i = 0; i < arrHalf.length; i++) {
            arrHalf[i] = (float) (arrHalf[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.arraycopy(arrHalf, 0, arr, size, size);
    }

    public static void fillArrByHalfs() {
        float[] arr = Main.getArr();
        int size = Main.getHALF();
        float[] arrHalf = new float[size];

        System.arraycopy(arr, 0, arrHalf, 0, size);

        for (int i = 0; i < arrHalf.length; i++) {
            arrHalf[i] = (float) (arrHalf[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.arraycopy(arrHalf, 0, arr, 0, size);


    }
}