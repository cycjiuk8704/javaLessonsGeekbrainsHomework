package geekbrainsjava.lesson9;

public class ArraySum {
    public static int sumArrayElements(String[][] arrayToSum) throws MyArrayDataException, MyArraySizeException {
        final int arSize = 4;
        int sum = 0;
        if (arrayToSum.length != arSize) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arrayToSum.length; i++) {
            if (arrayToSum[i].length != arSize) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arrayToSum[1].length; j++) {
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


