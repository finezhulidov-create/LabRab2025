package lab3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        System.out.println("\n for");
        printFibonacciFor(size);
        System.out.println("\n do while");
        printFibonacciDoWhile(size);
        System.out.println("\n while");
        printFibonacciWhile(size);
    }
    public static void printFibonacciFor(int size) {
       if (size <= 0) {
            return;
      }

        if (size >= 1) {
            System.out.print("1 ");
        }
        if (size >= 2) {
            System.out.print("1 ");
        }

        long a = 1, b = 1;
        for (int i = 3; i <= size; i++) {
            long next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
    }
    public static void printFibonacciDoWhile(int size){
        if (size<=0){
            return;
        }
        if (size >= 1){
            System.out.print("1 ");
        }
        if (size >= 2){
            System.out.print("1 ");
        }
        int i = 3;
        long a = 1, b = 1;
        do {

            long next = a + b;
            System.out.print(next+" ");
            a = b;
            b = next;
            i++;
        } while (i<=size);
        System.out.println();
    }
    public static void printFibonacciWhile(int size){
        if (size<=0) {
            return;
        }
        if (size>=1){
            System.out.print("1 ");
        }
        if (size>=2){
            System.out.print("1 ");
        }
        long a = 1, b = 1;
        int i = 3;
        while (i<=size){
            long next = a+b;
            System.out.print(next+" ");
            a = b;
            b = next;
            i++;
        }
        System.out.println();
    }
}










       /* int size= in.nextInt();
        int[] nums= new int[size];
        nums[0] = 1;
        nums[1] = 1;
        //for (int i = 3; i< nums.length; i++) {
           // nums[0] = 1;
           // nums[1] = 1;
        //}
        for (int j = 3; j< nums.length; j++) {
            nums[j + 1] = nums[j - 1] + nums[j - 2];
            System.out.println(nums);
        }
        }

    }*/

