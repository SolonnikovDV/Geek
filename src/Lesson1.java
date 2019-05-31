/**
 * Дмитрий Солонников, ДЗ №1, 27.05.2019
 *
 * 0. Создать пустой проект в IntelliJ IDEA и прописать метод main().
 * 1. Создать переменные всех пройденных типов данных и инициализировать их значения.
 * 2. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
 * где a, b, c, d – входные параметры этого метода.
 * 3. Написать метод, принимающий на вход два числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
 * если да – вернуть true, в противном случае – false.
 * 4. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное
 * ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
 * 5. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное.
 * 6. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль
 * сообщение «Привет, указанное_имя!».
 * 7*. Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
 * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */

import java.util.Random;
import java.util.Scanner;

public class Lesson1 {

    public static void main(String[] args) {
        boolean turn = true;
        String answer;
        Scanner scanner = new Scanner(System.in);

        while (turn) {
            System.out.print(" \n" + "Введите номер ДЗ:  ");
            getHomeWorkListNumber(scanner.nextInt());
            System.out.println();
            System.out.print(" \n" + "Если желате продолжить, нажмите любую кнопку. Для завершения введите 'N':  ");
            scanner.nextLine(); // костыль для корректиной отработки сканера ниже
            answer = scanner.nextLine();
            if (answer.equals("N")) turn = false;
        }
        System.out.println(" \n"+ "Вы вышли из ДЗ.");
    }

/****************** МЕТОДЫ *****************/

    /*** 1. Метод агрегатор */
    public static int getHomeWorkListNumber ( int casePoint){
        Scanner scanner = new Scanner(System.in);
        switch (casePoint) {
            case 1:
                System.out.println("Вы выбрали задание № " + casePoint);
                System.out.println("Описание задания: \n " + " - Создать переменные всех пройденных типов данных и инициализировать их значения.");
                System.out.print("\n" + "Желаете посмотреть выполнение ДЗ? \n" + "Нажмите 'Y' для продолжения или любую клавишу для отмены: ");
                showMeHomeWork1(scanner.nextLine());
                break;
            case 2:
                System.out.println("Вы выбрали задание № " + casePoint);
                System.out.println("Описание задания: \n " + " - Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,\n" +
                        " где a, b, c, d – входные параметры этого метода.");
                System.out.print("\n" + "Желаете посмотреть выполнение ДЗ? \n" + "Нажмите 'Y' для продолжения или любую клавишу для отмены: ");
                showMeHomeWork2(scanner.nextLine());
                break;
            case 3:
                System.out.println("Вы выбрали задание № " +casePoint);
                System.out.println("Описание задания: \n " + " - Написать метод, принимающий на вход два числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),\n" +
                        " если да – вернуть true, в противном случае – false.");
                System.out.print("\n" + "Желаете посмотреть выполнение ДЗ? \n" + "Нажмите 'Y' для продолжения или любую клавишу для отмены: ");
                showMeHomeWork3(scanner.nextLine());
                break;
            case 4:
                System.out.println("Вы выбрали задание № " + casePoint);
                System.out.println("Описание задания: \n " + " - Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное\n" +
                        " ли число передали или отрицательное. Замечание: ноль считаем положительным числом.");
                System.out.print("\n" + "Желаете посмотреть выполнение ДЗ? \n" + "Нажмите 'Y' для продолжения или любую клавишу для отмены: ");
                showMeHomeWork4(scanner.nextLine());
                break;
            case 5:
                System.out.println("Вы выбрали задание № " + casePoint);
                System.out.println("Описание задания: \n " + " - Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное.");
                System.out.print("\n" + "Желаете посмотреть выполнение ДЗ? \n" + "Нажмите 'Y' для продолжения или любую клавишу для отмены: ");
                showMeHomeWork5(scanner.nextLine());
                break;
            case 6:
                System.out.println("Вы выбрали задание № " + casePoint);
                System.out.println("Описание задания: \n " + " - Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль\n" +
                        " сообщение «Привет, указанное_имя!».");
                System.out.print("\n" + "Желаете посмотреть выполнение ДЗ? \n" + "Нажмите 'Y' для продолжения или любую клавишу для отмены: ");
                showMeHomeWork6(scanner.nextLine());
                break;
            case 7:
                System.out.println("Вы выбрали задание № " + casePoint);
                System.out.println("Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.\n" +
                        " Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.");
                System.out.print("\n" + "Желаете посмотреть выполнение ДЗ? \n" + "Нажмите 'Y' для продолжения или любую клавишу для отмены: ");
                showMeHomeWork7(scanner.nextLine());
                break;
            default:
                System.out.println("Вы ввели несуществущий ввели неверный номер ДЗ. \n" +
                        "Повторите ввод, выбирая от 1 до 7.");
        }
        return casePoint;
    }
    /*** 2. Методы вызова ДЗ */
    public static String showMeHomeWork1 (String homework){
        if(homework.equals("Y")){
            System.out.println("Результат задания :");
            listIntem_1();
        }
        return homework;
    }

    public static String showMeHomeWork2 (String homework){
        if(homework.equals("Y")) {
            System.out.println("Результат задания :");
            System.out.println(listIntem_2(mathRandomeRange1(), mathRandomeRange1(), mathRandomeRange1(), mathRandomeRange1()));
        }
        return homework;
    }

    public static String showMeHomeWork3 (String homework){
        if(homework.equals("Y")) {
            System.out.println("Результат задания :");
            listIntem_3(mathRandomeRange2(), mathRandomeRange2());
        }
        return homework;
    }

    public static String showMeHomeWork4 (String homework){
        if(homework.equals("Y")) {
            System.out.println("Результат задания :");
            listIntem_4(mathRandomeRange1());
        }
        return homework;
    }

    public static String showMeHomeWork5 (String homework){
        if(homework.equals("Y")) {
            System.out.println("Результат задания :");
            System.out.println(listIntem_5(mathRandomeRange1()));
        }
        return homework;
    }

    public static String showMeHomeWork6 (String homework){
        if(homework.equals("Y")) {
            System.out.println("Результат задания :");
            System.out.println("Привет, " + listIntem_6(new String[] {"Микеланджело", "Леонардо", "Донателло", "Рафаэль", "Фернандо Хулио Санчес"}) + "!!!!"); // здесь не хватило разобраться
        }
        return homework;
    }

    public static String showMeHomeWork7 (String homework){
        Scanner scanner = new Scanner(System.in);
        if(homework.equals("Y")) {
            System.out.println("Напоминаем, что високосным считается год кратный 4 и кратный 100б, если при этом делится на 400 без остатка");
            System.out.println("Введите год, который Вы хотите проверить :");
            listIntem_7(scanner.nextInt());
        }
        return homework;
    }

    /*** 3. Методы ДЗ */
    // Метод п. 1 ДЗ
    public static void listIntem_1 (){
        Random random = new Random();
        String charString = "qwertyuiop[]asdfghjkl;'zxcvbnm,./!@#$%^&*";

        byte randomByte = (byte) random.nextInt(1 << 8);
        short randomShort = (short) random.nextInt(1 << 16);
        int randomeInt = random.nextInt();
        long randomLong = random.nextLong();
        float randomFloat = random.nextFloat();
        double randomDouble = Math.random();
        char randomChar = charString.charAt(random.nextInt(charString.length()));
        boolean randomBoolean;
        if ((int)Math.floor(Math.random() * 2) > 0){ // 0 соответствует true, 1 соответствует false
            randomBoolean = false;
        }else{
            randomBoolean = true;
        }
        System.out.println("Результат: ");
        System.out.println("byte: " + randomByte + "\n" + "short: " + randomShort + "\n" + "int: " + randomeInt + "\n"
                + "long: " + randomLong + "\n" + "float: " + randomFloat + "\n" + "double: " + randomDouble + "\n"
                + "char: " + randomChar + "\n" + "boolean: " + randomBoolean);
    }

    // Метод п. 2 ДЗ
    public static int listIntem_2 (int a, int b, int c, int d){
        return (a * (b + (c / d)));
    }

    // Метод п. 3 ЗД
    public static boolean listIntem_3 (int a, int b) {
        boolean c = false;
        if (a >= 10 && a <= 20 && b >= 10 && b <= 20) c = true;
        System.out.println(" Полученные числа: " + a + b);
        return c;
    }

    // Метод п. 4 ДЗ
    public static void listIntem_4 (int a){
        if (a>=0) {
            System.out.println("Число " + a + " положительное");
        }else{
            System.out.println("Число " + a + " отрицательное");
        }
    }

    // Метод п. 5 ДЗ
    public static boolean listIntem_5 (int a){
        boolean b = false;
        if (a>=0) b = true;
        return b;
    }

    // Метод п. 6 ДЗ
    public static String listIntem_6 (String[] stringsArray){
        stringsArray = new String[] {"Микеланджело", "Леонардо", "Донателло", "Рафаэль", "Фернандо Хулио Санчес"};
        String randomWord = (stringsArray[new Random().nextInt(stringsArray.length)]);
        return randomWord;
    }

    // Метод п. 7 ДЗ
    public static void listIntem_7 (int checkYear){
        if (checkYear < 100 && checkYear % 4 == 0) {
            System.out.println("Год " + checkYear + " является високосным");
        }else if(checkYear >= 100 && checkYear % 4 == 0 && checkYear % 100 == 0 && checkYear % 400 == 0){
            System.out.println("Год " + checkYear + " является високосным");
        }else{
            System.out.println("Год " + checkYear + " не является високосным");
        }
    }

    /*** 4. Вспомогательные методы  */
    public static int mathRandomeRange1 (){ // метод для псевдослучайного целого числа в указанных пределах, чтобы вручную не указывать границы, min и max объявлены в теле метода
        int max = 100;
        int min = -100;
        return (int) Math.floor(Math.random() * (max - min)) + min;
    }

    public static int mathRandomeRange2 (){ // метод для псевдослучайного целого числа в указанных пределах, чтобы вручную не указывать границы, min и max объявлены в теле метода
        int max = 21;
        int min = 9;
        return (int) Math.floor(Math.random() * (max - min)) + min;
    }
}