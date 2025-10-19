package lab2;
import java.util.Scanner;

//Напишите программу, которая проверяет, удовлетворяет ли введенное пользователем число следующим критериям:
// число делится на 4, и при этом оно не меньше 10
public class Example3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter");
        int i= in.nextInt();
        if ((i%4==0)&&(i>=10))
            System.out.println(true);
        else
            System .out.println(false);
        in.close();
    }
}
