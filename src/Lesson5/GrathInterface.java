package Lesson5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GrathInterface extends JFrame {

    static int AGE_LIMIT = 40;
    static int WIDTH_BUTTON = 250;
    static int HEIGHT_BUTTON = 50;


    public static void main(String[] args) {

//  Через ArrayList в TextField выводится длиннющая строка...

//        ArrayList<Employee> employeeList = new ArrayList<Employee>() {
//        };
//        employeeList.add(new Employee(
//                1, "Donatello", "engineer", "donatello@tmnt.com", 88003030901L, 20, 2000));
//        System.out.println();
//        employeeList.add(new Employee(
//                2, "Leonardo", "system administrator", "leonardo@tmnt.com", 88003030902L, 24, 2500));
//        System.out.println();
//        employeeList.add(new Employee(
//                3, "Michelangelo", "art designer", "michelangelo@tmnt.com", 88003030903L, 18, 1800));
//        employeeList.add(new Employee(
//                4, "Rafael", "IS analyst", "rafael@tmnt.com", 88003030904L, 23, 1900));
//        employeeList.add(new Employee(
//                5, "Splinter", "Team lead", "splinter@tmnt.com", 88003030905L, 60, 2100));
//        employeeList.add(new Employee(
//                6, "Anatoliy", "Pizza delivery man", "delivery@pizza.com", 88003030911L, 45, 300));


//  С массивом TextField работает удачнее, все элементы выводятся построчно
        Employee[] employeeList = new Employee[6];

        // созданы элементы массива
        employeeList[0] = new Employee(
                101, "Donatello", "engineer", "donatello@tmnt.com", 88003030901L, 20, 2000);
        employeeList[1] = new Employee(
                102, "Leonardo", "system administrator", "leonardo@tmnt.com", 88003030902L, 24, 2500);
        employeeList[2] = new Employee(
                103, "Michelangelo", "art designer", "michelangelo@tmnt.com", 88003030903L, 18, 1800);
        employeeList[3] = new Employee(
                104, "Rafael", "IS analyst", "rafael@tmnt.com", 88003030904L, 23, 1900);
        employeeList[4] = new Employee(
                105, "Splinter", "Team lead", "splinter@tmnt.com", 88003030905L, 60, 2100);
        employeeList[5] = new Employee(
                106, "Anatoliy", "Pizza delivery man", "delivery@pizza.com", 88003030911L, 45, 300);


// Запускается графический интерфейс, принимающий на вход массив, в резльтате которого в TextField выводятся все элементы массива построчно:
        new GrathInterface(employeeList);

    }

    // Конструктор в который передается массив элементов класса Employee:
    GrathInterface(Employee[] employeeList){
        setLayout(null);
        setTitle("Employee List");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setBounds(500, 400, 500, 300);

//      можно создать переменные или напрямую обратиться к объектам (см ниже в setBounds
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

        setBounds(  Toolkit.getDefaultToolkit().getScreenSize().width/2 - 250,
                    Toolkit.getDefaultToolkit().getScreenSize().height/2 - 150, 500, 80);

//  Кнопка вызова сообщения с содежимым массива с данными
        JButton getListBtn = new JButton("Press to get Employee List");
        getListBtn.setSize(WIDTH_BUTTON, HEIGHT_BUTTON);
        getListBtn.setLocation(0,0);
        add(getListBtn);

//  Кнопка сортировки по возрасту
        JButton sortByAgeBtn = new JButton("Press to sort by age");
        sortByAgeBtn.setSize(WIDTH_BUTTON, HEIGHT_BUTTON);
        sortByAgeBtn.setLocation(250,0);
        add(sortByAgeBtn);

//  Текстовое поле вызываемое кнопками
        JTextField textField = new JTextField();
        textField.setSize(0, 0);

// обработчик нажатия кнопки getListBtn
        getListBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(textField, employeeList); // в текстовое поле выводтся все элементы массива employeeList

            }
        });

        sortByAgeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Employee[] layout = new Employee[employeeList.length - 1];
                int j = 0;
                for (int i = 0; i < employeeList.length; i++) {

                    if (employeeList[i].getAge() > AGE_LIMIT) {
                        layout[j] = employeeList[i];
                        j++;
                    }
                }
                JOptionPane.showMessageDialog(textField, layout);

            }
        });
    }
}
