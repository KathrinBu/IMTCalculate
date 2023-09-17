
import java.util.Scanner;
/*
Программа должна считывать введенные пользователем вес в килограммах и
рост в метрах и выводить на экран сообщение об индексе массы тела.
 */

public class Main {
    public static void main(String[] args) {
        double imt = 0;
        initial(imt);
        massIndex(imt);
    }

    public static double initial(double imt){
        System.out.println("введите ваш вес в КГ и ваш рост в М:");
        Scanner scanner=new Scanner(System.in);
        double weight=scanner.nextDouble();
        double height=scanner.nextDouble();
         imt=(weight/(height*height));
        return imt;
    }

    public static void massIndex(double imt){
        if (imt<18.5){
            System.out.println("Недовес");
        }
        if (imt>=18.5 && imt<24.9) {
            System.out.println("Нормальный");
        }
        if (imt>=25.0 && imt<29.9){
            System.out.println("Избыточный");
        }
        if (imt>=30.0){
            System.out.println("Ожирение");
        }

    }
}
