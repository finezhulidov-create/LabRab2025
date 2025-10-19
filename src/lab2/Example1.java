package lab2;
import java.util.Scanner;
//1. Напишите программу, которая проверяет, делится ли введенное Пользователем число на 3.

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter");
        int i = in.nextInt();
        int s = 3;
        if (i%s==0)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
