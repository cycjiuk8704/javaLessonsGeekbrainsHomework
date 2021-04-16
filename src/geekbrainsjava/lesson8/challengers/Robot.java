package geekbrainsjava.lesson8.challengers;

import geekbrainsjava.lesson8.Challengeable;

public class Robot implements Challengeable {
    private final String name;
    private final int maxClimbDistance;
    private final int maxRunDistance;

    public Robot(String name, int maxClimbDistance, int maxRunDistance) {
        this.name = name;
        this.maxClimbDistance = maxClimbDistance;
        this.maxRunDistance = maxRunDistance;
    }

    public void climb() {
        System.out.println("Робот " + name + " преодолел высоту");
    }

    public void run() {
        System.out.println("Робот " + name + " пробежал расстояние");
    }

    @Override
    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    @Override
    public int getMaxClimbDistance() {
        return maxClimbDistance;
    }

    @Override
    public String getName() {
        return name;
    }
}
