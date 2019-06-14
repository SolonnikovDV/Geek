import javax.swing.*;
import java.awt.*;

class HelloSwing extends JFrame {
    public static void main(String[] args) {
        new HelloSwing();

    }


    // конструктор без араметров
    HelloSwing(){
        setTitle("HelloSwing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 250);
        setLocationRelativeTo(null);

        // кнопка
        Button btnExit = new Button("Exit");
        // обработчик клика
        btnExit.addActionListener(e -> System.exit(0));
        // вывод кнопки
        add(btnExit);

        setVisible(true);

    }
}
