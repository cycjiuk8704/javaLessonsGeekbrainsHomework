package geekbrainsjava.lesson8.challengers;

import geekbrainsjava.lesson8.BaseChallengeable;
import geekbrainsjava.lesson8.Challengeable;

public class Human extends BaseChallengeable implements Challengeable {

    private final String name;
    private final int maxClimbDistance;
    private final int maxRunDistance;

    public Human(String name, int maxClimbDistance, int maxRunDistance) {
        this.name = name;
        this.maxClimbDistance = maxClimbDistance;
        this.maxRunDistance = maxRunDistance;
    }

    @Override
    protected void run() {
        System.out.println("Человек " + name + " пробежал расстояние");
    }

    @Override
    protected void climb() {
        System.out.println("Человек " + name + " преодолел высоту");
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
