package lab01;

import java.util.Scanner;

//Напишите программу для вычисления суммы двух чисел. Оба числа вводятся пользователем.
// Для вычисления суммы используйте оператор +.

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = in.nextInt();
        System.out.println("Введите второе число");
        int num2 = in.nextInt();
        int num3 = num1 + num2 ;
        System.out.println(num3);
        in.close();

    }
}
