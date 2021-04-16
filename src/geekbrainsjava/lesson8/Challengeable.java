package geekbrainsjava.lesson8;

import geekbrainsjava.lesson8.obstacles.ObstacleDirection;

public interface Challengeable {
//    void climb();
//    void run();

    void passObstacle(ObstacleDirection obstacleDirection);

    int getMaxRunDistance();
    int getMaxClimbDistance();
    String getName();
}
