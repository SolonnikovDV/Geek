import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        int imputYear = 1900;


            if (imputYear < 100 && imputYear % 4 == 0) {
                System.out.println("Год " + imputYear + " является високосным");
            }else if(imputYear >= 100 && imputYear % 4 == 0 && imputYear % 100 == 0 && imputYear % 400 == 0){
                System.out.println("Год " + imputYear + " является високосным");
            }else{
                System.out.println("Год " + imputYear + " не является високосным");
            }

    }
}