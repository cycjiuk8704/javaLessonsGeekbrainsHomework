package geekbrainsjava.lesson6;

public abstract class Animal {
    protected int swimDistance;
    protected int runDistance;
    protected String name;
    public static int animalCount = 0;
    public static int catCount = 0;
    public static int dogCount = 0;

    public abstract void swim();

    public abstract void run();

}
