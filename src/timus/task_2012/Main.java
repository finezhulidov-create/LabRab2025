package timus.task_2012;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f= in.nextInt();
        int r= 12-f;
        int tasksTime = r*45;


        if (tasksTime>=240)
        System.out.println("YES");
        else
            System.out.println("NO");

    }
}
