package lab3;

import java.lang.reflect.Array;
import java.util.Scanner;
/*4. Напишите программу, в которой пользователем вводится два целых числа.
 Программа выводит все целые числа — начиная с наименьшего (из двух введенных чисел) и
 заканчивая наибольшим (из двух введенных чисел). Предложите разные версии программы (с использованием разных операторов цикла).
*/
public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\n input 1");
        int num1 = in.nextInt();
        System.out.println("\n input 2");
        int num2 = in.nextInt();


        System.out.println("\n for");


        int min = Math.min(num1, num2);
            int max = Math.max(num1, num2);
            for (int i = min; i <= max; i++) {
                System.out.print(i + " ");
            }
            System.out.println();


        System.out.println("\n while");


        int min1 = Math.min(num1, num2);
        int max1 = Math.max(num1, num2);
        int i = min1;
        while(i <=max1)

        {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        System.out.println("do-while");
        int min2 = Math.min(num1, num2);
        int max2 = Math.max(num1, num2);
        int j = min2;
        do{

            System.out.print(j+" ");
            j++;
        } while (j<=max2);
        System.out.println();
    }


        }




