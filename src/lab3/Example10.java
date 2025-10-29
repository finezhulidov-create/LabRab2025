package lab3;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*10. Напишите программу, в которой создается целочисленный массив,
заполняется случайными числами и после этого значения элементов в массиве сортируются в порядке убывания значений.*/
public class Example10 {
    public static void main(String[] args) {
       // Scanner in = new Scanner(System.in);
        int[] nums = new int[10];
        Random random = new Random();
        for (int i = 0; i< nums.length; i++){
            nums[i] = random.nextInt(200);
        }
       // сортировка пузырьком по убыванию
       for (int i = 0; i< nums.length; i++){
            for (int j = i+1; j< nums.length; j++){
                if (nums[j]>nums[i]){
                    int swap = nums[j];
                    nums[j]= nums[i];
                    nums[i] = swap;


                }

            }
        }
      System.out.println("sort is enabled");
        for (int i=0 ; i< nums.length ; i++){
           System.out.print( + nums[i]+ " ");
        }
   }
}
