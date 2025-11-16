package lab4;

public class Example1 {
    public static void main(String[] args) {
        int fig = 11;
        int i;
        int j;
        int z;
        for ( i = 1; i <= fig; i++) {
            System.out.print("nomer stroki: "+ i + "  ");
            z=0;
            for ( j = -12; j < fig ; j++) {
                System.out.print("+");
                z += 1;
            }
            System.out.println("All simbols in str "+ z);
        }


    }
}
