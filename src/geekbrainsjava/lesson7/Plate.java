package geekbrainsjava.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood(Plate p, int food) {
        p.setFood(p.getFood() + food);
        System.out.println(food + " единиц еды добавлено в миску");
    }
}
