package geekbrainsjava.lesson8;

import geekbrainsjava.lesson8.obstacles.ObstacleDirection;

public interface Challengeable {

//    void passObstacle(ObstacleDirection obstacleDirection);
    boolean passObstacle(Overcomeable overcomeable);
    int getMaxRunDistance();
    int getMaxClimbDistance();
    String getName();
}
