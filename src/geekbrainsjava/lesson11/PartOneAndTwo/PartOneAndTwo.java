package geekbrainsjava.lesson11.PartOneAndTwo;

import java.util.ArrayList;
import java.util.Collections;

public class PartOneAndTwo<T> {

    public T[] swapElements(T[] objArr, int element1, int element2) {
        if (element1 < objArr.length && element2 < objArr.length) {
            T buf = objArr[element1];
            objArr[element1] = objArr[element2];
            objArr[element2] = buf;
        }
        return objArr;
    }

    public ArrayList<T> transformToList(T[] objArr) {
        ArrayList<T> objArrList = new ArrayList<>();
        Collections.addAll(objArrList, objArr);
        return objArrList;
    }

}
