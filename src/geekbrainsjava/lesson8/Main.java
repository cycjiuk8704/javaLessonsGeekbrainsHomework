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
        Overcomeable[] overcomeables = new Overcomeable[]{
                new Wall(3),
                new Treadmill(13)
        };

        Challenge challenge = new Challenge();
        challenge.passObstacles(challengeables, overcomeables);
//        for (Challengeable challengeable:challengeables) {
//            for (Overcomeable overcomeable:overcomeables) {
//                    if (overcomeable.getHeight() != 0 && overcomeable.getHeight() <= challengeable.getHeight()){
//                        challengeable.climb();
//                    } else if (overcomeable.getHeight() !=0 && overcomeable.getHeight() > challengeable.getHeight()){
//                        printLoser(challengeable.getName());
//                        break;
//                    }
//                if (overcomeable.getLength() != 0 && overcomeable.getLength() <= challengeable.getLength()){
//                    challengeable.run();
//                } else if (overcomeable.getLength() !=0 && overcomeable.getLength() > challengeable.getLength()){
//                    printLoser(challengeable.getName());
//                    break;
//                }
//            }
//        }
    }
//    private static void printLoser(String name) {
//        System.out.println("Участник " + name + " проиграл и выбывает");
//    }
}
