package geekbrainsjava.lesson8.challengers;

import geekbrainsjava.lesson8.BaseChallengeable;
import geekbrainsjava.lesson8.Challengeable;
import geekbrainsjava.lesson8.obstacles.ObstacleDirection;

public class Robot extends BaseChallengeable implements Challengeable {
    private final String name;
    private final int maxClimbDistance;
    private final int maxRunDistance;

    public Robot(String name, int maxClimbDistance, int maxRunDistance) {
        this.name = name;
        this.maxClimbDistance = maxClimbDistance;
        this.maxRunDistance = maxRunDistance;
    }

    @Override
    protected void run() {
        System.out.println("Робот " + name + " пробежал расстояние");
    }

    @Override
    protected void climb() {
        System.out.println("Робот " + name + " преодолел высоту");
    }

    //    private void climb() {
//        System.out.println("Робот " + name + " преодолел высоту");
//    }
//
//    private void run() {
//        System.out.println("Робот " + name + " пробежал расстояние");
//    }

//    @Override
//    public void passObstacle(ObstacleDirection obstacleDirection) {
//        if (obstacleDirection == ObstacleDirection.VERTICAL) {
//            climb();
//        } else {
//            run();
//        }
//    }

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
