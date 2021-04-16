package geekbrainsjava.lesson8.obstacles;

import geekbrainsjava.lesson8.Overcomeable;

public class Wall implements Overcomeable {

    private final int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    @Override
    public int getWallHeight() {
        return wallHeight;
    }

    @Override
    public int getRunLength() {
        return 0;
    }

}
