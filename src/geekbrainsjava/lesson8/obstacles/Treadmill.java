package geekbrainsjava.lesson8.obstacles;

import geekbrainsjava.lesson8.Overcomeable;

public class Treadmill implements Overcomeable {

    private final int runLength;

    public Treadmill(int runLength) {
        this.runLength = runLength;
    }

    @Override
    public int getWallHeight() {
        return 0;
    }

    @Override
    public int getRunLength() {
        return runLength;
    }

}
