package lab2;
import java.util.Scanner;


//Напишите программу, которая проверяет,
// удовлетворяет ли введенное пользователем число следующим критериям:
// при делении на 5 в остатке получается 2, а при делении на 7 в остатке получается 1. jcnfnjr jn ltktybz%
public class Example2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter");
        int i= in.nextInt();
        if ((i%5==2)&&(i%7==1))
            System.out.println(true);
            else
                System.out.println(false);
    }
}
