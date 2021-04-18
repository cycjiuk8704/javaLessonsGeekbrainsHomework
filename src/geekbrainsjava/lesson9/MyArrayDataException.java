package geekbrainsjava.lesson9;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(int i, int j, String symb, NumberFormatException nfe) {
        super("Invalid data '" + symb + "' at array element [" + i + "][" + j + "]", nfe);
    }

}
