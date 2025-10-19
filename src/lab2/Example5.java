package lab2;
import java.util.Scanner;

//Напишите программу, которая проверяет, сколько тысяч во введенном пользователем числе (определяется четвертая цифра справа в десятичном представлении числа).
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter");
        int i = in.nextInt();
        if (i>=1000);{
            int n = i/1000;
            System.out.println(n);

        }
    }
}
