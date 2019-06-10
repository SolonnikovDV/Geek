import java.util.Random;
import java.util.Scanner;

/**
 * Java. Level 1. Lesson 4. Homework doing. Exc #2
 *
 * @autor @Dmitriy Solonnikov
 * @version dated Jun-10-2019
 *
 * 2. Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4.
 * Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;.
 */

public class TicTacToe5x5 {

    final int SIZE = 5;
    final char DOT_EMPTY = '.';
    final char DOT_X = 'x'; // крестиками будет ходить игрок
    final char DOT_O = 'o'; // нулями ходит ИИ
    static char[][] map;
    Scanner sc;
    Random rand;


    public static void main(String[] args) {
        // отсюда (из статического метода) нельзя вызвать нестатическуи еременную или объект, это возможно только через объект
        // создаем объект на основании класса:
        new TicTacToe().game();

    }

    // создаем контструктор чтобы была возможность обратиться к нестатической переменной / константе / объекту
    TicTacToe5x5() {
        map = new char[SIZE][SIZE]; // тут мы обратились к нестатической константе
        sc = new Scanner(System.in);
        rand = new Random();
    }

    // создаются нестатические методы
    void game() {
        initMap();

        while (true) { // while (true) - конструкция бесконечного цикла, выход и него осуществляется через break;
            printMap();

            humanTurn();
            if (checkWin(DOT_X)) {
                System.out.println("\n" + "You won!");
                break;
            }
            if (isMapFull()) {
                System.out.println("\n" + "Draw...");
                break;
            }

            aiTurn();
            if (checkWin(DOT_O)) {
                System.out.println("\n" + "CPU won");
            }
            if (isMapFull()) {
                System.out.println("\n" + "Draw...");
                break;
            }

        }
        printMap();
    }

    // создание игрового поля
    void initMap() {
        for (int i = 0; i < SIZE; i++) { // заполняем двумерный массив точками
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    // вывод в консоль игрового поля
    void printMap() {
        for (int i = 0; i < SIZE; i++) { // заполняем двумерный массив точками
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + "  "); // обрати внимание, используется PRINT не PRINTLN
            }
            System.out.println(); // перевод строчки за один проход внешнего цикла for
        }
        System.out.println();
    }

    void humanTurn() {
        int x, y;

        do {
            System.out.print("Enter 'X' coord in the specified range [1..." + SIZE + "]: ");
            x = sc.nextInt() - 1; //  уменьшаем значение координаты на единицу, чтобы привести к порядковым номерам массива
            System.out.print("Enter 'Y' coord in the specified range [1..." + SIZE + "]: ");
            y = sc.nextInt() - 1;

        } while (!isCellValid(x, y) && isCellFull(x, y));
        // в этом месте при попдании координат в занятую ячейку дважды выводится сообщение isCellFull для каждой координаты
        map[x][y] = DOT_X;
    }

    void aiTurn() {
        int x, y;

        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));

        map[x][y] = DOT_O;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            System.out.println("Your coord is out of range. \n");
            return false;
        }
        return map[x][y] == DOT_EMPTY;
    }


    boolean checkWin(char symb) {
        boolean line, collumn, toRightDiag, toLeftDiag;

        // проверка диагонали сверху слева-направо
        toRightDiag = true;
        toLeftDiag = true;

        for (int i = 0; i < SIZE - 1; i++) {
            // накапливаем значение булевой переменной в цикле, если все элементы 'map' по значению совпадают с параметром метода
            // то будевая переменная остается true, если хоть один элемент 'map' != параметру, тогда возвращается false
            toRightDiag = toRightDiag & (map[i][i] == symb);
            toLeftDiag = toLeftDiag & (map[(SIZE - 1) - i -1][i] == symb);
        }
        if (toRightDiag) {
            return true;
        }
        if (toLeftDiag) {
            return true;
        }


        // проверка строк и столбцов
        for (int i = 0; i < SIZE - 1; i++) {
            line = true;
            collumn = true;

            for (int j = 0; j < SIZE - 1; j++) {
                line = line & (map[i][j] == symb);
                collumn = collumn & (map[j][i] == symb);
            }

            if (line) {
                return true;
            }
            if (collumn) {
                return true;
            }
        }


        return false;
    }


    boolean isMapFull () {
        for (int i = 0; i < SIZE; i++) { // заполняем двумерный массив точками
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }


    boolean isCellFull ( int x, int y){
        for (x = 0; x < SIZE; x++) {
            for (y = 0; y < SIZE; y++) {
                if (map[x][y] != DOT_EMPTY) {
                    System.out.println("Cell is not empty");
                    break;
                }
            }
        }
        return true;
    }
}
