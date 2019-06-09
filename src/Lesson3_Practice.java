import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson3_Practice {
    public static void main(String[] args) {
        int [] arr = new int [] {9, 1 ,12, 2, 3, 0, 5};
        System.out.println(Arrays.toString(arr));

        // сортировка массива
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // моментальный поиск заданного элемента ОТСОРТИРОВАННОГО массива
        int i = Arrays.binarySearch(arr, 1);
        System.out.println(i);

        // генерация рандомных значений типа random.nextInt()
        // данный метод применяется только к объекту
        Random random = new Random(); // вот так создается тот самый объект Random
        int[] arr2 = new int[10];
        for (int j = 0; j < arr2.length; j++) {
//            System.out.println(random.nextInt(15));
            arr2[j] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(arr2));

        //СКАНЕР
//        Scanner scanner = new Scanner(); // на вход применяется истончник информации: консоль, файлы и т.д.
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt(); // в данном случае система ждет ввода целого числа, в отношении отстальных система вызовет прерывание
        System.out.println(k);





    }
}
