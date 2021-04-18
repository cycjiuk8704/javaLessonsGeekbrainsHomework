package geekbrainsjava.lesson8;

import geekbrainsjava.lesson8.challengers.Cat;
import geekbrainsjava.lesson8.challengers.Human;
import geekbrainsjava.lesson8.challengers.Robot;
import geekbrainsjava.lesson8.obstacles.Treadmill;
import geekbrainsjava.lesson8.obstacles.Wall;

public class Main {

    public static void main(String[] args) {

        Challengeable[] challengeables = new Challengeable[]{
                new Cat("Barsik", 4, 15),
                new Robot("CyborgVasya", 2, 25),
                new Human("Gennadiy", 5, 10)
        };

        Surmountable[] surmountables = new Surmountable[]{
                new Wall(3),
                new Treadmill(13)
        };

        Challenge challenge = new Challenge();
        challenge.passObstacles(challengeables, surmountables);
    }
}
