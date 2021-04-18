package geekbrainsjava.lesson8;

import geekbrainsjava.lesson8.obstacles.ObstacleDirection;

public abstract class BaseChallengeable implements Challengeable {

    abstract protected void run();

    abstract protected void climb();

    @Override
    public final boolean passObstacle(Surmountable surmountable) {

        if (surmountable.getDirection() == (ObstacleDirection.VERTICAL)) {
            if (surmountable.getDistance() <= getMaxClimbDistance()) {
                climb();
                return true;
            } else if (surmountable.getDistance() > getMaxClimbDistance()) {
                printLoser(getName());
                return false;
            }
        } else if (surmountable.getDirection() == (ObstacleDirection.HORIZONTAL)) {
            if (surmountable.getDirection() == (ObstacleDirection.HORIZONTAL) && surmountable.getDistance() <= getMaxRunDistance()) {
                run();
                return true;
            } else if (surmountable.getDirection() == (ObstacleDirection.HORIZONTAL) && surmountable.getDistance() > getMaxRunDistance()) {
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
