package geekbrainsjava.lesson9;

public class MyArrayDataException extends Exception {
    private final int i;
    private final int j;
    private final String symb;


    public MyArrayDataException(int i, int j, String symb, NumberFormatException nfe) {
        super("Invalid data '" + symb + "' at array element [" + i + "][" + j + "]", nfe);
        this.i = i;
        this.j = j;
        this.symb = symb;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public String getSymb() {
        return symb;
    }
}
