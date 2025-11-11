package lab3;

import java.util.Scanner;

//5.	Напишите программу, в которой вычисляется сумма чисел, удовлетворяющих таким критериям: при делении числа на 5 в остатке получается 2,
// или при делении на 3 в остатке получается 1. Количество чисел в сумме вводится пользователем. Программа отображает числа, которые суммируются, и
// значение суммы. Предложите версии программы, использующие разные операторы цикла.
public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел для суммирования: ");
        long sum = 0;
        int count = scanner.nextInt();
       System.out.println("\n Do-While");
       cicleDoWhile(sum, count);
       System.out.println("\n While");
        cicleWhile(sum, count);
        System.out.println("\n For");
        cicleFor(sum, count);
    }

    public static void cicleFor(long sum, int count) {


        for (int i = 0; i < count; i++) {
            int number = i + 1; // Начинаем проверку с числа 1
            if (number % 5 == 2 || number % 3 == 1) {
                System.out.print(number + " ");
                sum += number;
            }
        }
        System.out.println();
    }

    public static void cicleWhile(long sum, int count) {
        int i = 0;
        while (i < count){
            int number = i + 1;
            if (number % 5 == 2 || number % 3 == 1){
                System.out.print(number + " " );
                sum += number;
            }
            i++;
        }
        System.out.println();
    }

    public static void cicleDoWhile(long sum, int count) {
        int i = 0;
        do {
            int number = i + 1;
            if (number % 5 == 2 || number % 3 == 1){
                System.out.print(number + " " );
                sum += number;
            }
            i++;
        } while(i < count);
        System.out.println();
    }
}
























    /* Scanner in =new Scanner(System.in);
        int[] sum1 = new int[in.nextInt()];
        Random random = new Random();
        for (int i = 0; i < sum1.length ; i++) {
            sum1[i] = random.nextInt(50);
            System.out.print(sum1[i] + " ");
        }
        for (int i = 0; i < sum1.length; i++) {
            if (sum1[i]%5==2 | sum1[i]%3==1){
                sum1[i]+=sum1[i+1];
            }
            System.out.print(sum1[i]+" ");
        }
    }
    public void array(){

    }
}*/
