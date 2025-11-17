package lab4;

public class Example2 {

    public static void Triangle(){
        int size = 6;
        int[][] trian = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i ; j++) {
                trian[i][j] = 1;

            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(trian[i][j] == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        //System.out.println();
    }









    public static void main(String[] args) {
                Triangle();
    }
}
