package Lesson5;

import java.text.MessageFormat;
import java.util.*;
import java.lang.String ;

/**
 * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * Конструктор класса должен заполнять эти поля при создании объекта.
 * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 * Создать массив из 5 сотрудников.
 * С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */

class Employee_Main {
    static int AGE_LIMIT = 40;

    public static void main(String[] args) {

        /** Решение с использование массива **/
// Раскоментировать для выполнения
//        Employee[] employeeList = new Employee[6]; // создан массив/объект из экземпляра класса Employee
//
//        // созданы элементы массива
//        employeeList[0] = new Employee(
//                101, "Donatello", "engineer", "donatello@tmnt.com", 88003030901L, 20, 2000);
//        employeeList[1] = new Employee(
//                102, "Leonardo", "system administrator", "leonardo@tmnt.com", 88003030902L, 24, 2500);
//        employeeList[2] = new Employee(
//                103, "Michelangelo", "art designer", "michelangelo@tmnt.com", 88003030903L, 18, 1800);
//        employeeList[3] = new Employee(
//                104, "Rafael", "IS analyst", "rafael@tmnt.com", 88003030904L, 23, 1900);
//        employeeList[4] = new Employee(
//                105, "Splinter", "Team lead", "splinter@tmnt.com", 88003030905L, 60, 2100);
//        employeeList[5] = new Employee(
//                106, "Anatoliy", "Pizza delivery man", "delivery@pizza.com", 88003030911L, 45, 300);

//        printList(employeeList); // возвращает в консоль перечень элементов массива

////      Вызов метода фильтрации списка по возрасту AGE_LIMIT
//        compareAgeLimit(employeeList);

        /** конец **/


        /** Способ с использованием переопределенного метода toString() */

        ArrayList<Employee> employeeList = new ArrayList<Employee>() {
        };
        employeeList.add(new Employee(
                1, "Donatello", "engineer", "donatello@tmnt.com", 88003030901L, 20, 2000));
        employeeList.add(new Employee(
                2, "Leonardo", "system administrator", "leonardo@tmnt.com", 88003030902L, 24, 2500));
        employeeList.add(new Employee(
                3, "Michelangelo", "art designer", "michelangelo@tmnt.com", 88003030903L, 18, 1800));
        employeeList.add(new Employee(
                4, "Rafael", "IS analyst", "rafael@tmnt.com", 88003030904L, 23, 1900));
        employeeList.add(new Employee(
                5, "Splinter", "Team lead", "splinter@tmnt.com", 88003030905L, 60, 2100));
        employeeList.add(new Employee(
                6, "Anatoliy", "Pizza delivery man", "delivery@pizza.com", 88003030911L, 45, 300));


//      Метод ввода в консоль списка работников ArrayList<Employee>
        printList(employeeList);

//      Еще один способ вывод в консоль списка ArrayList<Employee>
//       # взято из коллекции "Consumer.java#
//        employeeList.forEach((n) -> System.out.println(n));

//      Вызов метода фильтрации списка по возрасту AGE_LIMIT
        compareAgeLimit(employeeList);

        /** конец **/

    }

// Метод вывода едементов ArrayList для способа с ArrayList + toString
    static void printList (ArrayList<Employee> employeeList){

        System.out.println("Date of report: " + new Date().toString());
        System.out.println("Request autor name: " + System.getProperty("user.name") + "\n");
//  применен foreach
        for (Employee printEmloyeeList : employeeList) {
            System.out.println(printEmloyeeList);
        }
    }


//    Метод для способа с массивами

//    static void printList (Employee [] employeeList) {
//
//        System.out.println("Date of report: " + new Date().toString() + "\n");
//
//        for (int i = 0; i < employeeList.length; i++) {
//            employeeList[i].print();
//        }
//    }

// Метод сортировки Employee по возрасту AGE_LIMIT
    static void compareAgeLimit (ArrayList<Employee> employeeList){

        int count = 0;

        System.out.println("Date of report: " + new Date().toString());
        System.out.println("Request autor name: " + System.getProperty("user.name") + "\n");
        System.out.println("The age of next workers is above the limit of " + AGE_LIMIT + " y.o. : \n");

        for (int i = 0; i < employeeList.size(); i++) {

            if (employeeList.get(i).getAge() > AGE_LIMIT){

                count ++;

                System.out.println(MessageFormat.format(
                        "# {0}    Employee ID: {0}, \n" +
                                "       Name: {1}, \n" +
                                "       Position: {2}, \n" +
                                "       Email: {3}, \n" +
                                "       Phone number: {4}, \n" +
                                "       Wage: {5} \n",
                        count, employeeList.get(i).getId(), employeeList.get(i).getName(),
                        employeeList.get(i).getPosition(), employeeList.get(i).getEmail(),
                        employeeList.get(i).getPhoneNumber(), employeeList.get(i).getWage(),
                        employeeList.get(i).getAge()
                ));
            }
        }

    }

}





