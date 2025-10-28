package lab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
        for (int i = 0; i < nums.length - 1; i++){ // перебор каждого элемента массива
            for(int j = 0; j < nums.length - i - 1; j++){// перебор каждого элемента до предпоследнего
                if (nums[j+1]<nums[j]){// проверка соседних элементов и замена левого и правого
                    int swap =nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = swap;
                }
            }
        }
        System.out.println("sort is enabled");
        for (int i=0 ; i< nums.length ; i++){
            System.out.println("The element of array ["+i+"] after sort = " + nums[i]);
        }
    }
}
