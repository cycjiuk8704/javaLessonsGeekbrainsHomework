package lesson3;


import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        guessWord();
    }


    public static void guessWord() {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String answer = words[(int) (Math.random() * words.length)];
        System.out.println("Попробуйте угадать слово");
        String userAnswer = scanner.nextLine();

        for (int i = 1; i <= answer.length(); i++) {

            if (i == answer.length()) {
                System.out.println("Вы проиграли. Загаданное слово - " + answer);
            } else if (userAnswer.equals(answer)) {
                System.out.println("Вы угадали");
                break;
            } else {
                System.out.print("Вы ввели неправильное слово. Попробуйте еще раз. Подсказка: ");
                for (int j = 0; j < i; j++) {
                    System.out.print(answer.charAt(j));
                }
                for (int k = 1; k <= 15 - i; k++) {
                    System.out.print('*');
                }
                System.out.println(" ");
                userAnswer = scanner.nextLine();
            }
        }
        scanner.close();
    }

}
