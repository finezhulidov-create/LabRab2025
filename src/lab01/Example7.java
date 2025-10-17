package lab01;

import java.util.Scanner;

 //Напишите программу, в которой Пользователь вводит имя и возраст. Программа отображает сообщение об имени и возрасте пользователя

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Имя");
        String name = in.nextLine();
        System.out.println("Введите Возраст");
        int age = in.nextInt();
        System.out.println("Имя: " + name +" Возраст: "+ age);
        in.close();





    }
}

