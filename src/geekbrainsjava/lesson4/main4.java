package geekbrainsjava.lesson4;


import java.util.Random;
import java.util.Scanner;

public class main4 {
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] field;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }


    public static boolean checkWin(char symb) {
        for (int i = 0; i < SIZE; i++) { // vertical and horizontal lines check
            int winCountVertical = 0;
            int winCountHorizontal = 0;
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == symb) {
                    winCountVertical++;
                } else {
                    winCountVertical = 0;
                }
                if (field[j][i] == symb) {
                    winCountHorizontal++;
                } else {
                    winCountHorizontal = 0;
                }
                if (winCountVertical == DOTS_TO_WIN || winCountHorizontal == DOTS_TO_WIN) {
                    return true;
                }
            }
        }

        for (int i = 0; SIZE - i >= DOTS_TO_WIN; i++) { // main diagonal check
            int winCountDiag1 = 0;
            int winCountDiag2 = 0;
            for (int j = 0, k = i; k < SIZE; j++, k++) {
                if (field[j][k] == symb) {
                    winCountDiag1++;
                } else {
                    winCountDiag1 = 0;
                }
                if (field[k][j] == symb) {
                    winCountDiag2++;
                } else {
                    winCountDiag2 = 0;
                }
                if (winCountDiag1 == DOTS_TO_WIN || winCountDiag2 == DOTS_TO_WIN) {
                    return true;
                }
            }
        }

        for (int i = SIZE; i >= DOTS_TO_WIN; i--) { // second diagonal check
            int winCountDiag1 = 0;
            int winCountDiag2 = 0;
            for (int j = 0, k = i - 1; k >= 0; j++, k--) {
                if (field[j][k] == symb) {
                    winCountDiag1++;
                } else {
                    winCountDiag1 = 0;
                }
                if (field[SIZE - 1 - k][SIZE - 1 - j] == symb) {
                    winCountDiag2++;
                } else {
                    winCountDiag2 = 0;
                }
                if (winCountDiag1 == DOTS_TO_WIN || winCountDiag2 == DOTS_TO_WIN) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (isCellNotValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        field[y][x] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (isCellNotValid(x, y));
        field[y][x] = DOT_X;
    }

    public static boolean isCellNotValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return true;
        return field[y][x] != DOT_EMPTY;
    }

    public static void initMap() {
        field = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}


