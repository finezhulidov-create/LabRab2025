package lab01;
import java.util.Scanner;

//Напишите программу, в которой пользователь вводит число, а программой отображается последовательность из четырех чисел:
// число, на единицу меньше введённого, введенное число и число, на единицу больше введенного.
// Четвертое число должно быть квадратом суммы первых трех чисел.

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        int num1 = num-1;
        int num2 = num+1;
        int num3 = num1+num2;
        int num4 = num3*num3;
        System.out.println(num1);
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num4);

        in.close();

    }
}