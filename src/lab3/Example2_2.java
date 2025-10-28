package lab3;

import java.util.Scanner;

public class Example2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String day = in.nextLine();
        int number;
        //if (day.equalsIgnoreCase("Понедельник") || day.equalsIgnoreCase("Вторник") || day.equalsIgnoreCase("Среда") || day.equalsIgnoreCase("Четверг") || day.equalsIgnoreCase("Пятница") || day.equalsIgnoreCase("Суббота") || day.equalsIgnoreCase("Воскресенье")) {
        if (day.equalsIgnoreCase("Понедельник")){
            number =1;
            System.out.println(number);
            }
            else if (day.equalsIgnoreCase("Вторник")) {
            number = 2;
            System.out.println(number);
        }
             else if (day.equalsIgnoreCase("Среда")){
                number =3;
                System.out.println(number);
        }
        else if (day.equalsIgnoreCase("Четверг")){
            number =4;
            System.out.println(number);
        }
        else if (day.equalsIgnoreCase("Пятница")){
            number =5;
            System.out.println(number);
        }
        else if (day.equalsIgnoreCase("Суббота")){
            number =6;
            System.out.println(number);
        }else if (day.equalsIgnoreCase("Воскресенье")){
            number =7;
            System.out.println(number);
        }
        else System.out.println("Enter correct value");

        }
    }
//}
