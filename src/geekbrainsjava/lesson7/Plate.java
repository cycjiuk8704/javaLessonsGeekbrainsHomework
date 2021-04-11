package geekbrainsjava.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    private void varyFood(int changeFood, boolean printable) {
        food += changeFood;
        if (food < 0) {
            food = 0;
            System.out.println("Миска пуста");
        } else if (printable) {
            System.out.println(Math.abs(changeFood) + " единиц еды " + (changeFood >= 0 ? "добавили в миску" : "вынули из миски"));
        }
    }

    public void consumeFood(int food) {
        varyFood(-food, false);
    }

    public int getFood() {
        return food;
    }

    public void showInfo() {
        System.out.println("в миске еды: " + food);
    }

    public void addFood(int food) {
        varyFood(food, true);
    }
}
