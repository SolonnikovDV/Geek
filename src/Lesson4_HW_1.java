/**
 * Java. Level 1. Lesson 4. Homework doing. Exc #1
 *
 * @autor @Dmitriy Solonnikov
 * @version dated Jun-07-2019
 *
 * 1. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
 */

//    boolean checkWin(char dot) {
//        // check gorizont
//        if (map[0][0] == dot && map[1][0] == dot && map[2][0] == dot) return true;
//        if (map[0][1] == dot && map[1][1] == dot && map[2][1] == dot) return true;
//        if (map[0][2] == dot && map[1][2] == dot && map[2][2] == dot) return true;
//        // check vertical
//        if (map[0][0] == dot && map[0][1] == dot && map[0][2] == dot) return true;
//        if (map[1][0] == dot && map[1][1] == dot && map[1][2] == dot) return true;
//        if (map[2][0] == dot && map[2][1] == dot && map[2][2] == dot) return true;
//        // check diag
//        if (map[0][0] == dot && map[1][1] == dot && map[2][2] == dot) return true;
//        if (map[2][0] == dot && map[1][1] == dot && map[0][2] == dot) return true;
//        return false;
//    }


public class Lesson4_HW_1 {
    final int SIZE = 3;
    static char[][] map;

    /**
     * Метод проверки линий, столбцов и диагоналей двумерного массива
     * @param symb
     * @return
     */

    boolean checkWin(char symb) {
        boolean line, collumn, toRightDiag, toLeftDiag;

        // проверка диагонали сверху слева-направо
        toRightDiag = true;
        toLeftDiag = true;

        for (int i = 0; i < SIZE; i++) {
            // накапливаем значение булевой переменной в цикле, если все элементы 'map' по значению совпадают с параметром метода
            // то будевая переменная остается true, если хоть один элемент 'map' != параметру, тогда возвращается false
            toRightDiag = toRightDiag & (map[i][i] == symb);
            toLeftDiag = toLeftDiag & (map[SIZE - i -1][i] == symb);
        }
        if (toRightDiag) {
            return true;
        }
        if (toLeftDiag) {
            return true;
        }

//        // проверка диагонали сверху справа-налево (так как код повторяется, то объединяю его с предыдущим
//        toLeftDiag = true;
//        for (int i = 0; i < SIZE; i++) {
//            toLeftDiag = toLeftDiag & (map[SIZE - i -1][i] == symb);
//        }
//        if (toLeftDiag) {
//            return true;
//        }

        // проверка строк и столбцов
        for (int i = 0; i < SIZE; i++) {
            line = true;
            collumn = true;

            for (int j = 0; j < SIZE; j++) {
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

        // проверка столбцов (аналогично диагоналям, код перенес в блок с линиями)
//        for (int i = 0; i < SIZE; i++) {
//            collumn = true;
//
//            for (int j = 0; j < SIZE; j++) {
//                collumn = collumn & (map[j][i] == symb);
//            }
//
//            if (collumn) {
//                return true;
//            }
//        }

        return false;
    }
}
