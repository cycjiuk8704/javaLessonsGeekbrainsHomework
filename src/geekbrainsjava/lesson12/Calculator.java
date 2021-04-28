package geekbrainsjava.lesson12;

public class Calculator {
    public static float calculateFormula(float arrElem, int i) {

        arrElem = (float) (arrElem * Math.sin(0.2f + i / 5.0f) * Math.cos(0.2f + i / 5.0f) * Math.cos(0.4f + i / 2.0f));
        return arrElem;

    }
}
