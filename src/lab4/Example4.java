package lab4;
//Напишите программу, в которой создается двумерный массив, который выводит прямоугольный треугольник;
public class Example4 {

    public static void Triangle(){
        int size = 8;
        int[][] tria = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i  ; j++) {
                tria[i][j]= 2;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (tria[i][j]==2){
                    System.out.print(tria[i][j] + " ");
                } else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Triangle();
    }
}
