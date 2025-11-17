package lab4;
//Напишите программу, в которой создается двумерный массив, который выводи прямоугольник из цифр 2

public class Example3 {

   public static void Rectangle(){
       int len = 5;
       int hei = 4;
       int[][] rect = new int[len][hei];
       for (int i = 0; i < len; i++) {
           for (int j = 0; j <hei; j++) {
               rect[i][j] = 2;

           }
       }
       for (int i = 0; i < len; i++) {
           for (int j = 0; j < hei; j++) {
               System.out.print(rect[i][j] + " ");

           }
           System.out.println();
       }
       System.out.println();

    }

    public static void main(String[] args) {
        Rectangle();
    }
}
