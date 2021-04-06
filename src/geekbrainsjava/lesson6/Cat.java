package geekbrainsjava.lesson6;

public class Cat extends Animal{

    public Cat (String name, int swimDistance, int runDistance){
        catCount++;
        this.name = name;
        setSwimDistance(swimDistance);
        setRunDistance(runDistance);
    }

    public void setSwimDistance(int swimDistance) {
        if (swimDistance == 0) {
            this.swimDistance = swimDistance;
        } else {
            System.err.println("Некорректное значение. Кот не умеет плавать");
        }
    }

    public void setRunDistance(int runDistance) {
        if (runDistance <= 200) {
            this.runDistance = runDistance;
        } else {
            System.err.println("Некорректное значение. Кот может пробежать до 200 м.");
        }
    }

    @Override
    public void swim() {
        System.out.println("Кот не умеет плавать");
    }

    @Override
    public void run() {
        System.out.println(name + " пробежал " + runDistance + " м.");
    }
}
