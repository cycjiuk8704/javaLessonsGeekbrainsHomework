package geekbrainsjava.lesson8.challengers;

import geekbrainsjava.lesson8.Challengeable;

public class Human implements Challengeable {

    private final String name;
    private final int maxClimbDistance;
    private final int maxRunDistance;

    public Human(String name, int maxClimbDistance, int maxRunDistance) {
        this.name = name;
        this.maxClimbDistance = maxClimbDistance;
        this.maxRunDistance = maxRunDistance;
    }

    @Override
    public void climb() {
        System.out.println("Человек " + name + " преодолел высоту");

    }


    @Override
    public void run() {
        System.out.println("Человек " + name + " пробежал расстояние");
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
