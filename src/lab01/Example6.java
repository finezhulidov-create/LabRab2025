package lab01;

    import java.util.Scanner;

// Напишите программу, в которой Пользователь вводит сначала фамилию, затем имя, затем отчество.
// После ввода программа выводит сообщение «Hello <фамилия, имя, отчество>»
public class Example6 {
    public static void main(String[] args)

    {
        Scanner in = new Scanner(System.in);
        System.out.println("Привет, Введи свою фамилию");
        String surname = in.nextLine();
        System.out.println("Введи свое имя");
        String name = in.nextLine();
        System.out.println("Введи свое отчество");
        String nname = in.nextLine();
        System.out.println("Привет, " + surname + " , " + name + " , " + nname);
        in.close();
    }




}
