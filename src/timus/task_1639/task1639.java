package timus.task_1639;

import java.util.Scanner;

public class task1639 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        int totalMoves = m * n ;
        if (totalMoves % 2 == 0) {
            System.out.println("[:=[first]");
        }else {
            System.out.println("[second]=:]");
        }
        sc.close();
    }
}
