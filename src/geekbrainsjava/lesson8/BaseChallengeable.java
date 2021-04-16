package geekbrainsjava.lesson8;

import geekbrainsjava.lesson8.obstacles.ObstacleDirection;

public abstract class BaseChallengeable implements Challengeable {

    abstract protected void run();

    abstract protected void climb();

    @Override
    public final boolean passObstacle(Overcomeable overcomeable) {
        if (overcomeable.getDirection() == (ObstacleDirection.VERTICAL)) {
            if (overcomeable.getDistance() <= getMaxClimbDistance()) {
                climb();
                return true;
            } else if (overcomeable.getDistance() > getMaxClimbDistance()) {
                printLoser(getName());
                return false;
            }
        } else if (overcomeable.getDirection() == (ObstacleDirection.HORIZONTAL)) {
            if (overcomeable.getDirection() == (ObstacleDirection.HORIZONTAL) && overcomeable.getDistance() <= getMaxRunDistance()) {
                run();
                return true;
            } else if (overcomeable.getDirection() == (ObstacleDirection.HORIZONTAL) && overcomeable.getDistance() > getMaxRunDistance()) {
                printLoser(getName());
                return false;
            }
        }
            return false;

    }
    private static void printLoser(String name) {
        System.out.println("Участник " + name + " проиграл и выбывает");
    }
}
