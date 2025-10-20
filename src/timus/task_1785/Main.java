package timus.task_1785;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int i = in.nextInt();
        if (i<=4&&i>=1)
            out.println("few");
        else if (i<=9&&i>=5) {
            out.println("several");

        } else if (i<=19&&i>=10) {
            out.println("pack");

        } else if (i<=49&&i>=20) {
            out.println("lots");

        } else if (i<=99&&i>=50) {
            out.println("horde");

        } else if (i<=249&&i>=100) {
            out.println("throng");

        } else if (i<=499&&i>=250) {
            out.println("swarm");

        } else if (i<=999&&i>=500) {
            out.println("zounds");

        } else if (i>=1000) {
            out.println("legion");

        }


        out.println();
        out.flush();
    }
}