package geekbrainsjava.lesson7;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean isFull = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite && !isFull) {
            p.consumeFood(appetite);
            isFull = true;
            System.out.println("Кот " + name + " поел");
        } else if (!isFull) {
            System.out.println("Коту " + name + " недостаточно еды в миске");
        }
    }
}
