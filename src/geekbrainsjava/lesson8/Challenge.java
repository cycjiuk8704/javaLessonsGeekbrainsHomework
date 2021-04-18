package geekbrainsjava.lesson8;

public class Challenge {

    public void passObstacles(Challengeable[] challengeables, Surmountable[] surmountables) {
        for (Challengeable challengeable : challengeables) {
            for (Surmountable surmountable : surmountables) {
                if (!challengeable.passObstacle(surmountable)) {
                    break;
                }
            }
        }
    }
}