package Lesson5;

/**
 * Инкапсуляция - связывание кода с ....
 * В классе могут быть внутренние классы
 * Модификаторы доступа: private, public
 */

public class Lesson5_main {



    public static void main(String[] args) {

        // таким образом мы создаем объект вызывая класс Cat
        // в скобочки вводятся параметры конструктора класса Cat
        Cat cat = new Cat("Murzik", "White", 2); // первый конструктор
        Cat cat1 = new Cat ("Richard"); // второй констркутор (перегруженный, с одним параметром)

        Cat cat2 = new Cat("Sir Richard", "Grey", 3);
        System.out.println(cat2.voice());

        // тут вызываются значения полей класса и присваиваются значения объекту 'cat'
        String catName = cat.getName();
        cat.color = "White";
        cat.age = 2;
        cat.voice();
        System.out.println(catName + "\n" + cat.color + "\n" + cat.age + "\n" + cat.voice());

        // вызов метода класса Cat
        System.out.println(cat.voice());
        /**
         * неудобно постоянно задавать значения полей
         * для этого берем конструктор класса
         */

    }
}
