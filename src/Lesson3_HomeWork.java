import java.util.Random;
import java.util.Scanner;

/**
 * Java. Level 1. Lesson 3. Homework doing.
 *
 * @autor @Dmitriy Solonnikov
 * @version dated Jun-07-2019
 *
 * 1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
 * При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
 * После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 */

public class Lesson3_HomeWork {
    static int ARRAY_LENGTH = 10;   // Константа выведена для того, чтобы в методах генерации числа и длины массива не задавать
                                    // жесткие значения
                                    // В данном случае объявлена единственная константа как для генерации случаного значения
                                    // так и длины массива, так как эти значения только на 1 единицу (nextInt() не учитывает
                                    // правую границу диапазона
                                    // Если длины массива и диапазона рандомного будут значительно отличаться, следует
                                    // объявить вторую константу

    public static void main(String[] args) {
// ------ проверки------
//     # сюда надо скопировать массив, чтобы он не генерился заново:
//        int[] doommyArray = Arrays.copyOf(fillArray(ARRAY_LENGTH), fillArray(ARRAY_LENGTH).length);
//     # содержит случайную позицию массива:
//        int doommyIndex = fillRandomInt(ARRAY_LENGTH);
//     # Провека работы методов fillArray:
//        System.out.println(Arrays.toString(doommyArray));
//     # Провека работы методов index (слуайный индекс элемента масссива):
//        System.out.println(doommyIndex);
//
// ---------------------

        int doommyElement = fillArray(ARRAY_LENGTH)[fillRandomInt(ARRAY_LENGTH)]; // возвращает элемент массива, соответcтвующий слуайному индексу массива
        int userNumber; // сюда сохраняется ответ пользователя, введенного в консоль
        boolean toRepeat = true; // ключ входа / выхода из while
        Scanner scanner = new Scanner(System.in);

//     # Раскоментировать, чтобы сразу узнать правильный ответ:
//        System.out.println(doommyElement); // Провека работы возврата значения массива по индексу

        System.out.println("Угадайте число от 0 до 10");

        while (toRepeat)  {
            for (int counter = 0; counter < 3; counter++) {
                System.out.print("Enter the number: ");
                userNumber = scanner.nextInt();

                if (userNumber == doommyElement) {
                    System.out.println("Congratulations!!!!");
                    break;
                } else if (counter < 2) {
                    System.out.println("Try one more time. " + (2 - counter) + " rounds less");
                }
                System.out.println("You have no more tryes");

            }
            System.out.println("Do You want to repeat the game \n" + "Y / N:");
            if (repeatGame(scanner) == toRepeat){
                System.out.println("Game begin again \n");
            }else {
                System.out.println("Game over \n");
                toRepeat = false;
            }
        }
    }

// ------------------- Методы ---------------------

    // метод возвращения случайного целого числа
    public static int fillRandomInt (int ints){
        Random random = new Random();
        int i = random.nextInt(ints);
        return i;
    }

    // метод заполнения массива данной длины [10] случайными целыми числами fillRandomInt
    public static int [] fillArray (int length) {
        int [] arr = new int[length];
        for (int a = 0; a < arr.length; a++) {
            arr[a] = fillRandomInt(length + 1); // сюда передается дипазон возвращения случайного числа
        }
        return arr;
    }

    // метод повтора игры
    public static boolean repeatGame (Scanner scanner) {
        String answer = scanner.next();// .next использован вместо .nextLine, так как последний перевод каретки в тесте "\n" за ввод символа принимает
        while (true) {

            if (answer.equals("N")) {
                return false;
            } else if (answer.equals("Y")) {
                return true;
            } else {
                System.out.println("Wrong button");
            }
        }
    }
}