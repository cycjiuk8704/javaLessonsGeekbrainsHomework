package geekbrainsjava.lesson3;

public class Task1 {

    public static void task1GuessNumber() {

        final int minNumber = 0;
        final int maxNumber = 9;
        final int maxAttempts = 3;
        int replay;
        do {
            int numberToGuess = (int) (Math.random() * (maxNumber - minNumber)) + minNumber;
            System.out.println("Угадайте число от " + minNumber + " до " + maxNumber);
            for (int i = 1; true; i++) {
                int userNumber = Main3.scanner.nextInt();

                if (userNumber == numberToGuess) {
                    System.out.println("Поздравляю, Вы угадали. Загаданное число - " + numberToGuess + " Играем еще раз? (1 - да, 2 - нет)");
                    break;
                } else if (userNumber < numberToGuess) {
                    System.out.println("Загаданное число больше");
                } else {
                    System.out.println("Загаданное число меньше");
                }
                if (i == maxAttempts) {
                    System.out.println("Попытки исчерпаны. Вы проиграли. Загаданное число - " + numberToGuess + " Играем еще раз? (1 - да, 2 - нет)");
                    break;
                }
            }

            while (true) {
                replay = Main3.scanner.nextInt();
                if (replay == 1 || replay == 2) {
                    break;
                } else System.out.println("Вы ввели некорректное значение. 1 - играть сначала, 2 - выход");
            }
        } while (replay == 1);
    }


}
