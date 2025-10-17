package lab01;
import java.util.Scanner;

//Напишите программу, в которой Пользователь вводит два числа, а программой вычисляется и отображается сумма и разность этих чисел.

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num1 = in.nextInt();
        System.out.println("Введите второе число");
        int num2 = in.nextInt();
        int num3 = num1-num2;
        int num4 = num1+num2;

        System.out.println(num3);
        System.out.println(num4);


        in.close();

    }
}