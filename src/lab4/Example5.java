package lab4;
/*5. Напишите программу, в которой создается двумерный целочисленный массив.
Он заполняется случайными числами. Затем в этом массиве строки и столбцы меняются местами:
первая строка становится первым столбцом, вторая строка становиться вторым столбцом и так далее.
 Например, если исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив из 5 строк и 3 столбцов.
 */


import java.util.Random;

public class Example5 {

    public static void Matrix(){
        int sto = 4;
        int str = 5;
        int[][] matrix = new int[str][sto];
        Random random = new Random();
        System.out.println("Before transponation: ");
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < sto; j++) {
                matrix[i][j] = random.nextInt(9);
                System.out.print(matrix[i][j]+" ");
            }

            System.out.println();
        }
        System.out.println();


        for (int i = 0; i < str; i++) {
            for (int j = 1+i; j < sto; j++) {
               int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i]= temp;

            }
        }
        System.out.println("After transponation: ");
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < sto ; j++) {
                System.out.print( matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
    Matrix();
    }
}
