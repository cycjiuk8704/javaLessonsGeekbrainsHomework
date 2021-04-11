package geekbrainsjava.lesson7;

public class Cat {
    private String name;
    private final int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p, int food) {
        if (food >= appetite && !satiety) {
            p.decreaseFood(appetite);
            satiety = true;
            System.out.println("Кот " + name + " поел");
        } else if (!satiety){
            System.out.println("Коту " + name + " недостаточно еды в миске");
        }
    }
}
