package lab01;
import java.util.Scanner;

//Напишите программу, в которой по году рождения определяется возраст пользователя
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год рождения");
        int num = in.nextInt();
        int    num1 = 2025-num;

        System.out.println(num1);
        in.close();
    }

}