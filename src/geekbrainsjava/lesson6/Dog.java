package geekbrainsjava.lesson6;

public class Dog extends Animal {

    public static int dogCount = 0;

    public Dog(String name, int swimDistance, int runDistance) {
        dogCount++;
        this.name = name;
        setSwimDistance(swimDistance);
        setRunDistance(runDistance);
    }


    public void setSwimDistance(int swimDistance) {
        if (swimDistance <= 10) {
            this.swimDistance = swimDistance;
        } else {
            System.err.println("Некорректное значение. Собака может проплыть до 10 м.");
        }
    }


    public void setRunDistance(int runDistance) {
        if (runDistance <= 500) {
            this.runDistance = runDistance;
        } else {
            System.err.println("Некорректное значение. Собака может пробежать до 500 м.");
        }
    }

    @Override
    public void swim() {
        System.out.println(name + " проплыл " + swimDistance + " м.");
    }

    @Override
    public void run() {
        System.out.println(name + " пробежал " + swimDistance + " м.");
    }
}
