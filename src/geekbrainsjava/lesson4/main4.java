package geekbrainsjava.lesson4;


import java.util.Random;
import java.util.Scanner;
    public class main4 {
        public static int SIZE = 5;
        public static int DOTS_TO_WIN = 4;
        public static final char DOT_EMPTY = '•';
        public static final char DOT_X = 'X';
        public static final char DOT_O = 'O';
        public static char[][] map;
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

//        public static String toString(Object a[]) {
//            if (a == null)
//                return "null";
//
//            int iMax = a.length - 1;
//            if (iMax == -1)
//                return " ";
//
//            StringBuilder b = new StringBuilder();
//            for (int i = 0; ; i++) {
//                b.append(String.valueOf(a[i]));
//                if (i == iMax)
//                    return;
//                b.append(" ");
//            }
//        }

        public static boolean checkWin(char symb) {
            for (int i = 0; i < SIZE; i++) { // vertical and horizontal lines check
                int winCountY = 0;
                int winCountX = 0;
                for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb){
                    winCountY++;
                } else {
                    winCountY = 0;
                }
                    if (map[j][i] == symb){
                        winCountX++;
                    } else {
                        winCountX = 0;
                    }
                if (winCountY == DOTS_TO_WIN || winCountX == DOTS_TO_WIN){
                    return true;
                }
                }
            }

            for (int i = 0; SIZE - i >= DOTS_TO_WIN; i++) { // main diagonal check
                int winCountDiag1 = 0;
                int winCountDiag2 = 0;
                for (int j = 0, k = i; k < SIZE; j++, k++){
                    if (map[j][k] == symb){
                        winCountDiag1++;
                    } else {
                        winCountDiag1 = 0;
                    }
                    if (map[k][j] == symb){
                        winCountDiag2++;
                    } else {
                        winCountDiag2 = 0;
                    }
                    if (winCountDiag1 == DOTS_TO_WIN || winCountDiag2 == DOTS_TO_WIN){
                        return true;
                    }
                }
            }

            for (int i = SIZE; i >= DOTS_TO_WIN; i--) { // second diagonal check
                int winCountDiag1 = 0;
                int winCountDiag2 = 0;
                for (int j = 0, k = i - 1; k >= 0; j++, k--){
                    if (map[j][k] == symb){
                        winCountDiag1++;
                    } else {
                        winCountDiag1 = 0;
                    }
                    if (map[SIZE - 1 - k][SIZE - 1 - j] == symb){
                        winCountDiag2++;
                    } else {
                        winCountDiag2 = 0;
                    }
                    if (winCountDiag1 == DOTS_TO_WIN || winCountDiag2 == DOTS_TO_WIN){
                        return true;
                    }
                }
            }
//            if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//            if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//            if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//            if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//            if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//            if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//            if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//            if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
            return false;
        }
        public static boolean isMapFull() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) return false;
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
            map[y][x] = DOT_O;
        }
        public static void humanTurn() {
            int x, y;
            do {
                System.out.println("Введите координаты в формате X Y");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } while (isCellNotValid(x, y));
            map[y][x] = DOT_X;
        }
        public static boolean isCellNotValid(int x, int y) {
            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return true;
            return map[y][x] != DOT_EMPTY;
        }
        public static void initMap() {
            map = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
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
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }


