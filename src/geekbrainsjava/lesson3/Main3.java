package geekbrainsjava.lesson3;

import java.util.Scanner;

public class Main3 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Чтобы запустить игру введите с клавиатуры:");
            System.out.println("1 - угадайть чиcло");
            System.out.println("2 - угадать слово");
            int chooseGame = scanner.nextInt();
            if (chooseGame == 1) {
                Task1.task1GuessNumber();
                break;
            } else if (chooseGame == 2) {
                Task2.task2GuessWord();
                break;
            } else System.out.println("Введено некорректное значение");
        }
        scanner.close();
    }

}
