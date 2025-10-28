package lab3;

import java.util.Scanner;

//1. Напишите программу, в которой пользователь вводит целое число в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
// Если введенное пользователем число выходит за допустимый диапазон, выводится сообщение о том, что введено некорректное значение.
// Используйте оператор выбора switch.
public class Example1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int number= in.nextInt();
        String day;
        switch (number){
            case 1:
                day = "Понедельник";
                System.out.println(day);
                break;
            case 2:
                day = "Вторник";
                System.out.println(day);
                break;
            case 3:
                day = "Среда";
                System.out.println(day);
                break;
            case 4:
                day = "Четверг";
                System.out.println(day);
                break;
            case 5:
                day = "Пятница";
                System.out.println(day);
                break;
            case 6:
                day = "Суббота";
                System.out.println(day);
                break;
            case 7:
                day = "Воскресенье";
                System.out.println(day);
                break;

        }
        if (number<1 || number>7){
            System.out.println("Неверное число, попробуйте снова");
        }

    }
}
