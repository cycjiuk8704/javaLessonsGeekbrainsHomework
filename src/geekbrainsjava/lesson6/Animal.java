package geekbrainsjava.lesson6;

public abstract class Animal {
    protected int swimDistance;
    protected int runDistance;
    protected String name;

    public static int animalCount() {
        return Cat.catCount + Dog.dogCount;
    }

    public abstract void swim();

    public abstract void run();

}
