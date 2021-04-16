package geekbrainsjava.lesson8;

import geekbrainsjava.lesson8.obstacles.ObstacleDirection;

public class Challenge {

    public void passObstacles(Challengeable[] challengeables, Overcomeable[] overcomeables) {
        for (Challengeable challengeable : challengeables) {
            for (Overcomeable overcomeable : overcomeables) {
                if (overcomeable.getDirection().equals(ObstacleDirection.VERTICAL) && overcomeable.getDistance() <= challengeable.getMaxClimbDistance()) {
                    challengeable.passObstacle(ObstacleDirection.VERTICAL);
                } else if (overcomeable.getDirection().equals(ObstacleDirection.VERTICAL) && overcomeable.getDistance() > challengeable.getMaxClimbDistance()) {
                    printLoser(challengeable.getName());
                    break;
                }
                if (overcomeable.getDirection().equals(ObstacleDirection.HORIZONTAL) && overcomeable.getDistance() <= challengeable.getMaxRunDistance()) {
                    challengeable.passObstacle(ObstacleDirection.HORIZONTAL);
                } else if (overcomeable.getDirection().equals(ObstacleDirection.HORIZONTAL) && overcomeable.getDistance() > challengeable.getMaxRunDistance()) {
                    printLoser(challengeable.getName());
                    break;
                }
            }
        }
    }

    private static void printLoser(String name) {
        System.out.println("Участник " + name + " проиграл и выбывает");
    }
}