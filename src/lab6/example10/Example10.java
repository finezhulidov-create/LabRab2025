package lab6.example10;

import java.util.Arrays;

//Напишите программу со статическим методом, аргументом которому передается произвольное количество целочисленных аргументов.
// Результатом метод возвращает массив из двух элементов: это значения наибольшего и наименьшего значений среди аргументов, переданных методу.
public class Example10 {
    public static int[] arrayMinMax(int... a){
        Arrays.sort(a);
        int[] newArr = new int[2];
        newArr[1] = a[a.length-1];
        newArr[0] = a[0];

        return newArr ;
    }
    public static void main(String[] args) {
        int a =14;
        int b= 15;
        int c = 16;
        int d = 2;
      int[] arrInt = arrayMinMax(a,b,c,d);
        System.out.println(Arrays.toString(arrInt));
    }
}
