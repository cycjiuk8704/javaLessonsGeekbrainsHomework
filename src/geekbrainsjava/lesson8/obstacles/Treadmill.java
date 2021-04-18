package geekbrainsjava.lesson8.obstacles;

import geekbrainsjava.lesson8.Surmountable;

public class Treadmill implements Surmountable {

    private final int runLength;

    public Treadmill(int runLength) {
        this.runLength = runLength;
    }

    @Override
    public ObstacleDirection getDirection() {
        return ObstacleDirection.HORIZONTAL;
    }

    @Override
    public int getDistance() {
        return runLength;
    }

}
