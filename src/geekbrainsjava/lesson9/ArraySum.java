package geekbrainsjava.lesson9;

public class ArraySum {
    public static int sumArrayElements(String[][] arrayToSum) throws MyArrayDataException, MyArraySizeException {
        int sum = 0;
        if (arrayToSum.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arrayToSum.length; i++) {
            for (int j = 0; j < arrayToSum[1].length; j++) {
                if (arrayToSum[i].length != 4) {
                    throw new MyArraySizeException();
                }
                try {
                    sum += Integer.parseInt(arrayToSum[i][j]);
                } catch (NumberFormatException nfe) {
                    throw new MyArrayDataException(i, j, arrayToSum[i][j], nfe);

                }
            }
        }
        return sum;
    }
}


