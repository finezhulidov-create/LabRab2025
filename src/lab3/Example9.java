package lab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;     // 0 1 2 3

public class Example9 {
    public static void main(String[] args) {
        Scanner id= new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = id.nextInt();
        System.out.println("Size of array is "+ size);
        int[] nums = new int[size];
        Random random = new Random();
        for (int i=0; i < nums.length ; i++){
            nums[i] = random.nextInt(200);
            System.out.println("Element of array ["+i+"] = "+ nums[i]);
        }
        // сортировка пузырьком
        for (int i = 0; i < nums.length ; i++){ // перебор каждого элемента массива
            for(int j = i+1; j < nums.length; j++){// перебор каждого элемента до предпоследнего
                if (nums[j]<nums[i]){// проверка соседних элементов и замена левого и правого
                    int swap =nums[j];
                    nums[j] = nums[i];
                    nums[i] = swap;
                }
            }
        }
        System.out.println("sort is enabled");
        for (int i=0 ; i< nums.length ; i++){
            System.out.println("The element of array ["+i+"] after sort = " + nums[i]);
        }
    }
}
