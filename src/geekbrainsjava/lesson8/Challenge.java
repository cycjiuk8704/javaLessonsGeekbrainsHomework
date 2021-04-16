package geekbrainsjava.lesson8;

public class Challenge {

    public void passObstacles(Challengeable[] challengeables, Overcomeable[] overcomeables) {
        for (Challengeable challengeable : challengeables) {
            for (Overcomeable overcomeable : overcomeables) {
                if (overcomeable.getWallHeight() != 0 && overcomeable.getWallHeight() <= challengeable.getMaxClimbDistance()) {
                    challengeable.climb();
                } else if (overcomeable.getWallHeight() != 0 && overcomeable.getWallHeight() > challengeable.getMaxClimbDistance()) {
                    printLoser(challengeable.getName());
                    break;
                }
                if (overcomeable.getRunLength() != 0 && overcomeable.getRunLength() <= challengeable.getMaxRunDistance()) {
                    challengeable.run();
                } else if (overcomeable.getRunLength() != 0 && overcomeable.getRunLength() > challengeable.getMaxRunDistance()) {
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
