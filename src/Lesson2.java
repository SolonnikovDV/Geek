import java.util.ArrayList;
import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        int [] arr = new int[5];

        ArrayList<Integer> list = new ArrayList<>(); // ArrayList - так называемый списочный массив (резиновый)

        list.add(1); // наполнение листа
        list.add(2);
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.get(1)); // list.add (номер элемента из списка) - вызов элемента по порядковому номеру из списка

        System.out.println();
        for (int i = 0; i < arr.length ; i++) {
            if (i == 3){ // вызывает исключение элмента массива под порядковым номером №4
                continue;
            }
            arr[i] = i + 2;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();

        for (int j: arr) {
            System.out.println(j);
        }

    }
}
