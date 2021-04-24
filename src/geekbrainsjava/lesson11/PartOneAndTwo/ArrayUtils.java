package geekbrainsjava.lesson11.PartOneAndTwo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayUtils<T> {

    public static <T> void swapElements(T[] objArr, int element1, int element2) {
        T buf = objArr[element1];
        objArr[element1] = objArr[element2];
        objArr[element2] = buf;
    }

    public static <T> ArrayList<T> transformToList(T[] objArr) {
        ArrayList<T> objArrList = new ArrayList<>();
        Collections.addAll(objArrList, objArr);
        return objArrList;
    }

}
