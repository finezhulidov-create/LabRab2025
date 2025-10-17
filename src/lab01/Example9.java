package lab01;
import java.util.Scanner;

//Напишите программу, в которой пользователю предлагается ввести название месяца и количество дней в этом месяце.
// Программа выводит сообщение о том, что соответствующий месяц содержит указанное количество дней.

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название месяца");
        String name = in.nextLine();
        System.out.println("Введите колличество дней в месяце");
        int date = in.nextInt();
        System.out.println("B " + name + " , " + date + " дней " );
        in.close();
    }

}
