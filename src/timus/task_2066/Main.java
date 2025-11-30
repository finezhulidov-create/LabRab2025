package timus.task_2066;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (0<=a && 0<=b && 0 <=c && a<=b && a<=c && a<=100 && b<=100 && c<=100) {
            if (a==0 && b==0 || a==0 && b==1|| a==1&& b==1|| b==0||c==0||(a==1&& b==1&&c==1)) {
                out.println(a-b-c);
            } else out.println(a-b*c);

        }

    out.flush();
    }
}
