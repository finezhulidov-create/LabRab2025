package lab4;
/*
* 7. Напишите программу, в которой создается двумерный числовой массив и этот массив заполняется «змейкой»:
* сначала первая строка (слева направо), затем последний столбец (сверху вниз),
* вторая строка (справа налево) и так далее, как показано на рисунке:*/
public class Example7 {
    public static void main(String[] args) {
            int n = 7;
            Snake(n);
    }
    public static void Snake(int n) {
      int[][] snake = new int[n][n];
      int a = -1;
      int count = 1;
        for (int i = 0; i < n; i++) {
           a *= -1;
           int start = 0;
           if (i % 2 != 0) start = n-1;
           else start = 0;
            for (int j = start; (j < n) & (j >= 0) ; j+=a) {
                snake[i][j] = count++;
            }
        }
        printSnake(snake);

    }
    public static void printSnake(int[][] arr){
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }


    }
    }


