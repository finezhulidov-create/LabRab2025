package lab5.example6;

public class Main {
    public static void main(String[] args) {
        Example6 example6 = new Example6(43,15);
        example6.printMaxMin();
        System.out.println();
        example6.setValues(3,49);
        example6.printMaxMin();
        System.out.println();
        example6.setValues(59);
        example6.printMaxMin();
        System.out.println();
        Example6 ex = new Example6(63);
        ex.setValues(38,1);
        ex.printMaxMin();
    }
}
