package geekbrainsjava.lesson6;

public abstract class Animal {
    protected int swimDistance;
    protected int runDistance;
    protected String name;

    public static int animalCount(int catCount, int dogCount) {
        return catCount + dogCount;
    }

    public abstract void swim();

    public abstract void run();

}
