package lab01;
import java.util.Scanner;

//Напишите программу, в которой Пользователь вводит имя и год рождения, в программа отображает сообщение содержащее имя пользователя и его возраст.

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Имя");
        String name = in.nextLine();
        System.out.println("Введите год рождения");
        int num = in.nextInt();
        int    num1 = 2025-num;

        System.out.println(name+" , "+num1);
        in.close();
    }

}