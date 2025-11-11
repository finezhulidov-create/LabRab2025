package lab3;

import java.util.Scanner;

//6. Напишите программу, в которой создается одномерный числовой массив и заполняется числами, которые при делении на 5 дают в остатке 2 (числа 2, 7,12,17 и так далее).
// Размер массива вводится пользователем. Предусмотреть обработку ошибки, связанной с вводом некорректного значения.
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sum = 0;
        System.out.println("Введите размер массива: ");
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            int num = i + 1;
            if (num % 5 == 2) {
                System.out.print(num + " ");
                sum += num;
            }


        }
    }
}
