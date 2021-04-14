package geekbrainsjava.lesson8;

public class Treadmill implements Overcomeable{

    private final int runLength;

    public Treadmill(int runLength) {
        this.runLength = runLength;
    }

    @Override
    public int getLength() {
        return runLength;
    }

    @Override
    public int getHeight() {
        return 0;
    }

}
