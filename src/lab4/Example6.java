package lab4;

import java.util.Random;

/*
* 6. Напишите программу, в которой создается и инициализируется двумерный числовой массив.
* Затем из этого массива удаляется строка и столбец (создается новый массив, в котором по сравнению с исходным удалена одна строка и один столбец).
* Индекс удаляемой строки и индекс удаляемого столбца определяется с помощью генератора случайных чисел.
* */
public class Example6 {
    public static void main (String[]args){
        MatrixDeleteIndex();
    }
    public static void MatrixDeleteIndex() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {6, 9, 13, 23},
                {10, 11, 14, 17},
                {21, 22, 36, 76}
        };
        System.out.println("Исходный массив: ");
        printArray(matrix);
        Random random = new Random();
        int row= matrix.length;
        int col = matrix[0].length;
        int rowIndex = random.nextInt(row);
        int colIndex = random.nextInt(col);
        System.out.println("Удаляемая строка: "+ rowIndex);
        System.out.println("Удаляемая колонка: "+ colIndex);
        int[][] newMatrix = new int[row-1][col-1];
        int newRow = 0;
        for (int i = 0; i < row; i++) {
            if(i==rowIndex){
                continue;
            }
            int newCol = 0;
            for (int j = 0; j < col; j++) {
                if(j==colIndex){
                    continue;
                }
                newMatrix[newRow][newCol] = matrix[i][j];
                newCol++;
            }
            newRow++;
        }
        System.out.println("New matrix: ");
        printArray(newMatrix);

    }

    public static void printArray(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

    }
}
