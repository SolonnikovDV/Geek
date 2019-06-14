package Lesson5;

import java.text.MessageFormat;

class Employee {
    private int id;
    private String name;
    private String position;
    private String email;
    private long phoneNumber;
    private int wage;
    private int age;

    // ----- Getters --------------------//
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public int getWage() {
        return wage;
    }

    public int getAge() {
        return wage;
    }
// ----- Getters --------------------//

    // ----- конструктор ----------------//
    public Employee(int id, String name, String position, String email, long phoneNumber, int wage, int age) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.wage = wage;
        this.age = age;
    }
// ----- конструктор ----------------//


// этот метод передается в класс Employee_Main для способа с массивом
//    void print () {
//        System.out.println(MessageFormat.format(
//                "Employee ID: {0}, \n" +
//                                        "Name: {1}, \n" +
//                                        "Position: {2}, \n" +
//                                        "Email: {3}, \n" +
//                                        "Phone number: {4}, \n" +
//                                        "Wage: {5} \n",
//                getId(), getName(), getPosition(), getEmail(), getPhoneNumber(), getWage(), getAge()
//        ));
//    }


    // Для способа с ArrayList
    /** Преобразование формата для вывода информации toString () **/

    @Override
    public String toString() {
        return "Employee " + getId() + " [Name: " + getName()
                + ", Position: " + getPosition()
                + ", Email: " + getEmail()
                + ", Phone-number: " + getPosition()
                + ", Wage: " + getWage()
                + ", Age: " + getAge()+ "]";
    }

    /** конец**/

}
