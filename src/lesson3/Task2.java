package lesson3;

public class Task2 {
    public static int ATTEMPT_COUNT = 0;

    public static void execute2() {
        guessWord();
    }

    public static void guessWord() {

        final String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        final String answer = words[(int) (Math.random() * words.length)];
        System.out.println("Попробуйте угадать слово");

        while (true) {
            String userAnswer = Main3.scanner.nextLine();
            ATTEMPT_COUNT++;

            if (userAnswer.equals(answer)) {
                System.out.println("Вы угадали");
                break;
            } else if (ATTEMPT_COUNT == answer.length()) {
                System.out.println("Вы проиграли. Загаданное слово - " + answer);
                break;
            }

            printHint(answer, ATTEMPT_COUNT);
        }
    }

    public static void printHint(String answer, int attemptCount) {
        final int maxChars = 15;

        System.out.print("Вы ввели неправильное слово. Попробуйте еще раз. Подсказка: ");
        for (int j = 0; j <= attemptCount - 1; j++) {
            System.out.print(answer.charAt(j));
        }

        if (attemptCount < maxChars) {
            for (int k = 1; k <= maxChars - attemptCount; k++) {
                System.out.print('*');
            }
        }
        System.out.println(" ");
    }
}
