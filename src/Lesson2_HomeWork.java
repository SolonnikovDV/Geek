/**
 * Java. Level 1. Lesson 2. Homework doing.
 *
 * @autor @Dmitriy Solonnikov
 * @version dated Jun-03-2019
 *
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 *      С помощью цикла и условия заменить 0 на 1, 1 на 0;
 *
 * 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
 *
 * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 *
 * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 *      и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
 *
 * 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
 *
 * 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
 *      если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
 *
 * 7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
 *      или отрицательным), при этом метод должен сместить все элементымассива на n позиций.
 *      Для усложнения задачи нельзя пользоваться вспомогательными массивами.
 */

import java.util.Arrays;

public class Lesson2_HomeWork {
    public static void main(String[] args) {
        System.out.println("пункт № 1 ДЗ");
        System.out.println(Arrays.toString(invertArray()) + "\n");
        System.out.println("пункт № 2 ДЗ");
        System.out.println(Arrays.toString(fillArray()) + "\n");
        System.out.println("пункт № 3 ДЗ");
        System.out.println(Arrays.toString(changeArray()) + "\n");
        System.out.println("пункт № 4 ДЗ");
        System.out.println(fillDiagonal() + "\n");
        System.out.println("пункт № 5 ДЗ");
        System.out.println(minMax());

    }


    public static int [] invertArray (){
//        int [] array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; // проверка
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = fillRandomInt();
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        return arr;
    }

    public static int [] fillArray () {
        int [] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        return arr;
    }

    public static int [] changeArray () {
        int [] arr = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 6) arr[i] = arr[i] * 2;
        }
        return arr;
    }

    public static int[][] fillDiagonal () {
        int i, j;
        int[][] arr = new int[5][5];
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                if(i == j){
                    arr[i][j] = 1;
                    arr[arr.length - 1- j][j] = 1;
                    arr[i][arr.length - 1- i] = 1;
                }
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        return arr;
    }

    public static int[] minMax (){
        int min, max;
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = fillRandomInt2();
        }
        System.out.println("Исходный массив: " + Arrays.toString(arr));

        min = max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }

        System.out.println("Максимальное значение массива: " + max);
        System.out.println("Минимальное значение массива: " + min);
        return arr;
    }

    // вспомогательный метод для генерации случайных чисел в пределах [0 ; 1]
    public static int fillRandomInt (){
        int i = (int) Math.floor(Math.random() * 2);
        return i;
    }

    // вспомогательный метод для генерации случайных чисел в пределах [0 ; 10]
    public static int fillRandomInt2 (){
        int i = (int) Math.floor(Math.random() * 11);
        return i;
    }

}
