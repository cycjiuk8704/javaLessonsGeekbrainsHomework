package geekbrainsjava.lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] catAr = new Cat[]{
                new Cat("Барсик", 15),
                new Cat("Мурзик", 14),
                new Cat("Васька", 21),
                new Cat("Гарфилд", 16),
                new Cat("Том", 13),
                new Cat("Леопольд", 17),
                new Cat("Базилио", 13),
        };

        Plate plate = new Plate(100);
        plate.info();
        feedCat(catAr, plate);
        plate.info();

        plate.addFood(plate, 40);
        plate.info();

        feedCat(catAr, plate);
        plate.info();

    }
    public static void feedCat(Cat[] catAr, Plate plate){
        for (Cat cat:catAr) {
            cat.eat(plate, plate.getFood());
        }
    }
}
