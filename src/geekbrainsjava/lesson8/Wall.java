package geekbrainsjava.lesson8;

public class Wall implements Overcomeable{

    private final int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public int getHeight() {
        return wallHeight;
    }
}
