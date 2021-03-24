package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        guessWord();
    }

    private static Scanner scanner = new Scanner(System.in);

    public static void guessWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String answer = words[(int) (Math.random() * words.length)];
        System.out.println("Попробуйте угадать слово");
        String userAnswer = scanner.nextLine();
        char[] hint = {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*'};
        for (int i = 1; i <= answer.length(); i++) {

            if (i == answer.length()) {
                System.out.println("Вы проиграли. Загаданное слово - " + answer);
            } else if (userAnswer.equals(answer)) {
                System.out.println("Вы угадали");
                break;
            } else {
                answer.getChars(0, i, hint, 0);
                System.out.println("Вы ввели неправильное слово. Попробуйте еще раз. Подсказка: " + Arrays.toString(hint));
                userAnswer = scanner.nextLine();
            }
        }
        scanner.close();
    }

}
