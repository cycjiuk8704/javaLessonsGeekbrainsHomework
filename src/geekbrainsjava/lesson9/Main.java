package geekbrainsjava.lesson9;

public class Main {
    public static void main(String[] args) {
        String[][] sumArr = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "A", "11", "12"},
                {"13", "14", "15", "16"},
                {"17", "18", "19", "20"},
        };


        try {
            System.out.println(ArraySum.sumArrayElements(sumArr));
        } catch (MyArrayDataException myArrayDataException) {
            System.err.println("Неправильное значение элемента массива '" + myArrayDataException.getSymb() + "' по адресу [" + myArrayDataException.getI() + "][" + myArrayDataException.getJ() + "]");
        } catch (MyArraySizeException e) {
            System.err.println("Неправильный размер массива");
        }
    }
}
