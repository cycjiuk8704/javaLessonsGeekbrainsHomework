package geekbrainsjava.lesson14;

public class ArrayUtils {

    public static int[] arrModifier(int arr[]) {
        int numberTrigger = 4;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == numberTrigger && i == arr.length - 1) {
                System.out.println(numberTrigger + " - последний элемент массива");
                return new int[]{0};
            }

            if (arr[i] == numberTrigger) {
                int[] modifiedArray = new int[arr.length - i - 1];
                System.arraycopy(arr, i + 1, modifiedArray, 0, modifiedArray.length);
                return modifiedArray;
            }
        }
        throw new RuntimeException();
    }


}
