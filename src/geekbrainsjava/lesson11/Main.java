package geekbrainsjava.lesson11;

import geekbrainsjava.lesson11.fruitPackage.Apple;
import geekbrainsjava.lesson11.fruitPackage.Orange;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        for (int i = 0; i < 6; i++) {
            appleBox1.addFruit(new Apple());
        }
        for (int i = 0; i < 3; i++) {
            appleBox2.addFruit(new Apple());
        }
        for (int i = 0; i < 4; i++) {
            orangeBox1.addFruit(new Orange());
        }
        System.out.println(appleBox1.getFruitBox());
        System.out.println(appleBox2.getFruitBox());
        System.out.println(orangeBox1.getFruitBox());
        System.out.println(orangeBox2.getFruitBox());

        System.out.println(appleBox1.compare(orangeBox1));

        appleBox1.transferFruit(appleBox2);
        orangeBox1.transferFruit(orangeBox2);
        System.out.println(appleBox1.getFruitBox());
        System.out.println(appleBox2.getFruitBox());
        System.out.println(orangeBox1.getFruitBox());
        System.out.println(orangeBox2.getFruitBox());

        System.out.println(appleBox2.compare(orangeBox2));
    }
}
