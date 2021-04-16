package geekbrainsjava.lesson8;

public class Challenge {

    public void passObstacles(Challengeable[] challengeables, Overcomeable[] overcomeables) {
        for (Challengeable challengeable : challengeables) {
            for (Overcomeable overcomeable : overcomeables) {
                  if (!challengeable.passObstacle(overcomeable)) {
                    break;
                  }

            }
        }
    }

}