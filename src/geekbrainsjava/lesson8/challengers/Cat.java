package geekbrainsjava.lesson8.challengers;

import geekbrainsjava.lesson8.Challengeable;
import geekbrainsjava.lesson8.obstacles.ObstacleDirection;

public class Cat implements Challengeable {
    private final String name;
    private final int maxClimbDistance;
    private final int maxRunDistance;

    public Cat(String name, int maxClimbDistance, int maxRunDistance) {
        this.name = name;
        this.maxClimbDistance = maxClimbDistance;
        this.maxRunDistance = maxRunDistance;
    }

    private void climb() {
        System.out.println("Кот " + name + " преодолел высоту");

    }

    private void run() {
        System.out.println("Кот " + name + " пробежал расстояние");

    }

    @Override
    public void passObstacle(ObstacleDirection obstacleDirection) {
        if (obstacleDirection == ObstacleDirection.VERTICAL) {
            climb();
        } else {
            run();
        }
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
