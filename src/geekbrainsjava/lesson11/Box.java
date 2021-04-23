package geekbrainsjava.lesson11;

import geekbrainsjava.lesson11.fruitPackage.Fruit;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    ArrayList<T> fruitBox = new ArrayList<>();

    public void addFruit(T fruit) {
        fruitBox.add(fruit);
    }

    public float getBoxWeight() {
        return fruitBox.size() * fruitBox.get(0).getWeight();
    }

    public boolean compare(Box<?> boxToCompareWith) {
        Float boxToCompareWeight = boxToCompareWith.getBoxWeight();
        Float boxWeight = getBoxWeight();
        return Math.abs(boxWeight - boxToCompareWeight) < 0.0001;
    }

    private ArrayList<T> extractFruits() {
        return fruitBox;
    }

    public void transferFruit(Box<T> boxToTransferTo) {
        boxToTransferTo.fruitBox.addAll(extractFruits());
        fruitBox.clear();
    }

}