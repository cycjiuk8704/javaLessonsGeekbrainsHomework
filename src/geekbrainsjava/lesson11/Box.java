package geekbrainsjava.lesson11;

import geekbrainsjava.lesson11.fruitPackage.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruitBox = new ArrayList<>();

    public void addFruit(T fruit) {
        fruitBox.add(fruit);
    }

    public float getBoxWeight() {
        if (fruitBox.isEmpty()) {
            return 0.0f;
        } else {
            return fruitBox.size() * fruitBox.get(0).getWeight();
        }
    }

    public boolean compare(Box<?> boxToCompareWith) {
        float boxToCompareWeight = boxToCompareWith.getBoxWeight();
        float boxWeight = getBoxWeight();
        return Math.abs(boxWeight - boxToCompareWeight) < 0.0001;
    }

    private List<T> extractFruits() {
        return fruitBox;
    }

    public void transferFruit(Box<T> boxToTransferTo) {
        boxToTransferTo.fruitBox.addAll(extractFruits());
        fruitBox.clear();
    }

    public List<T> getFruitBox() {
        return fruitBox;
    }
}