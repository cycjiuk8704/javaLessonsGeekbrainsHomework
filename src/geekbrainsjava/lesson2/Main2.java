package geekbrainsjava.lesson2;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        invertBitArray();
        fillArray();
        changeArray();
        fillDiagonal();
        findMinMax();
        checkBalance();
        moveArray();
    }

    //    part 1 полный оператор if для возможности работать не только с 0 и 1
    public static void invertBitArray() {
        int[] arr = {1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //    part 2
    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    //    part 3
    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //    part 4
    public static void fillDiagonal() {
        int[][] arr = {
                {3, 5, 12, 26, 4},
                {16, 2, 9, 17, 13},
                {23, 15, 24, 6, 75},
                {39, 0, 82, 76, 4},
                {13, 21, 65, 57, 25},
        };
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            arr[i][j] = 1;
            arr[i][arr.length - 1 - j] = 1;
        }
        System.out.println(Arrays.deepToString(arr));
    }

    //    part 5
    public static void findMinMax() {
        int[] arr = {12, 16, 35, 22, 11, 31, 5, 2, 75, 8, 9, 15};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Максимельный элемент в массиве равен " + max + ", минимальный элемент в массиве равен " + min);
    }

    //    part 6
    public static void checkBalance() {
        int[] arr = {12, 16, 35, 22, 11, 31, 10, 5, 75, 8, 11, 18};
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0, j = arr.length - 1; i <= j; ) {
            if (sumLeft <= sumRight) {
                sumLeft += arr[i];
                i++;
            } else {
                sumRight += arr[j];
                j--;
            }
        }
        if (sumLeft == sumRight) {
            System.out.println("Суммы левой и правой части массивов равны");
        } else {
            System.out.println("Сумма левых элементов равна " + sumLeft + "; сумма правых элементов равна " + sumRight);
        }
    }

    //    part 7
    public static void moveArray() {
        int[] arr = {12, 16, 35, 22, 11, 31, 10, 5, 75, 8, 11, 18};
        int n = -6;
        int buf;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                buf = arr[arr.length - 1];
                for (int j = 0; j < arr.length - 1; j++) {

                    arr[arr.length - j - 1] = arr[arr.length - j - 2];
                }
                arr[0] = buf;
            }

        } else if (n < 0) {
            for (int i = -1; i >= n; i--) {
                buf = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {

                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = buf;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
