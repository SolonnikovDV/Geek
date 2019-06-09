import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Java. Level 1. Lesson 3. Homework doing.
 *
 * @autor @Dmitriy Solonnikov
 * @version dated Jun-07-2019
 *
 * 2. Создать массив из слов
 * String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
 * "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
 * "pumpkin", "potato"}.
 * При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом
 * и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
 * apple – загаданное
 * apricot - ответ игрока
 * ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
 * Для сравнения двух слов посимвольно можно пользоваться:
 * String str = "apple";
 * char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
 * Играем до тех пор, пока игрок не отгадает слово.
 * Используем только маленькие буквы.
 */

/**
 * При выполнении задания намерянно включена опция продолжить или прекратить ['Y' or 'N']
 */

public class Lesson3_HW_2 {

    static int MASH_LENGTH = 15;

    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Scanner scanner = new Scanner(System.in);
        boolean toRepeat = true;

// ----------------------- проверки -------------------- //
//   #  фиксируем возвращенный методом случайный элемент массива:
//        String guessWordArray = randomWord(words);
//   # проверка метода randomWord для возврата случайного слова из заданного массива:
//        System.out.println(guessWordArray);
//   # проверка метода randomWord для возврата случайного слова из заданного массива:
//        System.out.println(Arrays.toString(wordToChar(guessWordArray)));
//   # получаем массив символов из случайного слова исходного массива строк:
//        System.out.println(Arrays.toString(wordToChar(randomWord(words))));

// -----------------------/        /------------------- //


        while (toRepeat) {
            System.out.print("Try to guess a word. Enter your word here: ");
            String guessWord = randomWord(words); // фиксируется случайное слово из заданного массива строк.
            String doommyUserWord = userWord(scanner); // фиксируется значение, введенное пользователем в консоль
            System.out.println(doommyUserWord); // проверка

            if (doommyUserWord.equals(guessWord)) {
                System.out.println("Congratulations!!");
                break;

            } else {
                System.out.println("Missed...");
//            System.out.println(Arrays.toString(wordToChar(userWord))); // проверка
                wordToChar(doommyUserWord);
                System.out.print("Here You can see a letters You've guess: " +
                        Arrays.toString(equalsLiterals(wordToChar(guessWord), wordToChar(doommyUserWord))) + "\n");
                System.out.print("\n" + "Do You want to try again? \n" + "Enter 'Y' or 'N': ");
                System.out.println();

                if(repeatGame(scanner) == toRepeat){
                    System.out.println("Your next try.");

                } else {
                    System.out.println("Game over.");
                    toRepeat = false;
                }

            }

        }
        scanner.close();
    }

    // ------------------- Методы ---------------------

    static String randomWord (String [] wordsArray){ // сюда в main передадим наш массив 'words'
        Random random = new Random();
        int index = random.nextInt(wordsArray.length);
        return wordsArray[index]; // отсюда вернем случайный элемент/слово массива
    }

    static char [] wordToChar (String string){
        return string.toCharArray();
    }

    static String userWord (Scanner scanner){ // передается результат метода randomWord
        String userWord = scanner.next();

        return userWord;    // если юзер ошибся, тогда возвращается его слово, которое потом нужно будет перевести в символы
                            // и поэлементно сравнить на совпадения с загаданным словом
    }

    // метод сравнения букв загаданного слова со словом юзера
    static char[] equalsLiterals (char[] guessWordInCharArray, char[] userWordInCharArray){

        char[] mashArray = new char[MASH_LENGTH];

        for (int k = 0; k < MASH_LENGTH; k++) {
            mashArray[k] = '#';
        }

        for (int i = 0; i < guessWordInCharArray.length; i++) {
            for (int j = 0; j < userWordInCharArray.length; j++) {

                if (guessWordInCharArray[i] == userWordInCharArray[j]){
                    mashArray[i] = guessWordInCharArray[i]; // здесь в массив mashArray будут вставлены совпавшие буквы
                }
            }
        }
        return mashArray;
    }

    public static boolean repeatGame (Scanner scanner) {

        while (true) {
            String answer = scanner.next();// .next использован вместо .nextLine, так как последний перевод каретки в тесте "\n" за ввод символа принимает

            if (answer.equals("N")) {
                return false;

            } else if (answer.equals("Y")) {
                return true;

            } else {
                System.out.print("Wrong button. Please, enter 'Y' or 'N': ");
            }
        }
    }
}