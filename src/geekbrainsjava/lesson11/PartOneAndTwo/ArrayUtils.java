package geekbrainsjava.lesson11.PartOneAndTwo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayUtils<T> {

    public static <T> T[] swapElements(T[] objArr, int element1, int element2) {
        try {

            T buf = objArr[element1];
            objArr[element1] = objArr[element2];
            objArr[element2] = buf;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("элементы в массиве не найдены");
        }
        return objArr;
    }

    public static <T> ArrayList<T> transformToList(T[] objArr) {
        ArrayList<T> objArrList = new ArrayList<>();
        Collections.addAll(objArrList, objArr);
        return objArrList;
    }

}
