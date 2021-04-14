package geekbrainsjava.lesson8;

public class Cat implements Challengeable{
    private final String name;
    private final int maxClimbDistance;
    private final int maxRunDistance;

    public Cat(String name, int maxClimbDistance, int maxRunDistance) {
        this.name = name;
        this.maxClimbDistance = maxClimbDistance;
        this.maxRunDistance = maxRunDistance;
    }

    @Override
    public void climb() {
        System.out.println("Кот " + name + " преодолел высоту");
    }

    @Override
    public void run() {
        System.out.println("Кот " + name + " пробежал расстояние");
    }

    @Override
    public int getLength() {
        return maxRunDistance;
    }

    @Override
    public int getHeight() {
        return maxClimbDistance;
    }

    @Override
    public String getName() {
        return name;
    }
}
