package lab2;
import java.util.Scanner;

//Напишите программу, которая проверяет, попадает ли введение пользователем число в диапазон от 5 до 10 включительно.
public class Example4 {
    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    System.out.println("Enter");
    int i=in.nextInt();
    if ((5 <= i) && (i <= 10))
        System.out.println(true);
    else
        System.out.println(false);

    in.close();

        ;


    }
}