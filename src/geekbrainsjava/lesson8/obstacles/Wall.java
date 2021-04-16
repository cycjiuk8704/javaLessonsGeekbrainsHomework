package geekbrainsjava.lesson8.obstacles;

import geekbrainsjava.lesson8.Overcomeable;

public class Wall implements Overcomeable {

    private final int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    @Override
    public int getDistance() {
        return wallHeight;
    }

    @Override
    public ObstacleDirection getDirection() {
        return ObstacleDirection.VERTICAL;
    }

}
