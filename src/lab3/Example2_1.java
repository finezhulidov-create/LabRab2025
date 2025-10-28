package lab3;

import java.util.Scanner;

public class Example2_1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String day= in.nextLine();

        if (day.equalsIgnoreCase("Понедельник" ) || day.equalsIgnoreCase("Вторник")||day.equalsIgnoreCase("Среда")||day.equalsIgnoreCase("Четверг")||day.equalsIgnoreCase("Пятница")||day.equalsIgnoreCase("Суббота")||day.equalsIgnoreCase("Воскресенье")) {
            int number;
            switch (day) {
                case "Понедельник":
                    number = 1;
                    System.out.println(number);
                    break;
                case "Вторник":
                    number = 2;
                    System.out.println(number);
                    break;
                case "Среда":
                    number = 3;
                    System.out.println(number);
                    break;
                case "Четверг":
                    number = 4;
                    System.out.println(number);
                    break;
                case "Пятница":
                    number = 5;
                    System.out.println(number);
                    break;
                case "Суббота":
                    number = 6;
                    System.out.println(number);
                    break;
                case "Воскресенье":
                    number = 7;
                    System.out.println(number);
                    break;
            }
        }
        else System.out.println("Некорректное значение");
       // if (day.equalsIgnoreCase("Понедельник","Вторник","Среда","Четверг","Пятница","Суббота","Воскресенье")){
            //System.out.println("Неверное число, попробуйте снова");
        }

    }
