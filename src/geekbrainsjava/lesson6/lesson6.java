package geekbrainsjava.lesson6;

public class lesson6 {
    public static void main(String[] args) {
        Cat catMurzik = new Cat("Мурзик", 0, 150);
        Dog dogBobik = new Dog("Бобик", 7, 400);

        catMurzik.run();
        dogBobik.swim();

        System.out.println("Всего создано " + Dog.dogCount + " собак, " + Cat.catCount + " кошек. Всего животных : " + Animal.animalCount(Cat.catCount, Dog.dogCount));
    }
}
