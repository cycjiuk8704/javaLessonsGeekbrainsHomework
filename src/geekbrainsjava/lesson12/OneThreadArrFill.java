package geekbrainsjava.lesson12;

public class OneThreadArrFill {

    public static void fillFullArray(float[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Calculator.calculateFormula(arr[i], i);
        }


    }
}
