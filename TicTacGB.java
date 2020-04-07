
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static char[][] map; //матрица
    private static int size = 3; // размерность

    private static final char dot_empty = '-';
    private static final char dot_x = 'X';
    private static final char dot_o = 'O';
    private static final boolean SILLY_MODE = false;

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            if (isEndGame(dot_x)) {
                break;
            }
            computerTurn();
            if (isEndGame(dot_o)) {
                break;
            }
        }

        System.out.println("Игра закончена!");
    }

    private static void initMap() {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = dot_empty;
            }
        }
    }

    private static void printMap() {
        for (int i = 0; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты через пробел");
            y = scanner.nextInt() - 1;
            x = scanner.nextInt() - 1;
        } while (CellValid(x, y));

        map[y][x] = dot_x;
    }

    private static void computerTurn() {
        int x = -1;
        int y = -1;
        
            do {
                x = random.nextInt(size);
                y = random.nextInt(size);
            } while (CellValid(x, y));


        System.out.println("Компьютер выбрал ячейку " + (y + 1) + " " + (x + 1));
        map[y][x] = dot_o;
    }


    private static boolean CellValid(int x, int y) {
        boolean result = true;

        if (x < 0 || x >= size || y < 0 || y >= size) {
            result = false;
        }

        if (map[y][x] != dot_empty) {
            result = false;
        }
        return !result;
    }

    private static boolean isEndGame(char playersSymbol) {
        boolean result = false;

        printMap();

        if (checkWin(playersSymbol)) {
            System.out.println("Победили " + playersSymbol);
            result = true;
        }

        if (isMapFull()) {
            System.out.println("Ничья");
            result = true;
        }
        return result;
    }

    private static boolean isMapFull() {
        boolean result = true;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == dot_empty) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    private static boolean checkWin(char playerSymbol) {
        if (checkDiagonal(playerSymbol) || checkLanes(playerSymbol)) return true;
        return false;
    }

    private static boolean checkDiagonal (char playerSymbol){
        boolean toR,toL;
        toR = true;
        toL = true;
        for (int i = 0; i < size; i++){
            toR &= (map[i][i] == playerSymbol);
            toL &= (map[size - i - 1][i] == playerSymbol);
        }
        if (toR || toL) return  true;
        return false;
    }

    private static boolean checkLanes(char playerSymbol){
        boolean vertical, horizontal;
        for (int i = 0; i < size; i++){
        vertical = true;
        horizontal = true;
        for (int j = 0; j < size; j++){
            horizontal &= (map[i][j] == playerSymbol);
            vertical &= (map[j][i] == playerSymbol);
        }
        if (vertical || horizontal) return true;
        }
        return false;
    }
}