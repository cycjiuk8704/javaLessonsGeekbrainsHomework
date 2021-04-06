package geekbrainsjava.lesson6;

public class lesson6 {
    public static void main(String[] args) {
        Cat catMurzik = new Cat("Мурзик", 0, 150);
        Dog dogBobik = new Dog("Бобик", 7, 400);

        catMurzik.run();
        dogBobik.swim();
        Animal.animalCount = Animal.catCount + Animal.dogCount;

        System.out.println("Всего создано " + Animal.dogCount + " собак, " + Animal.catCount + " кошек. Всего животных : " + Animal.animalCount);
    }
}
