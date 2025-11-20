package lab5.example5;

public class Main {
    public static void main(String[] args) {
        Example5 e5= new Example5();
        e5.setAnyInt();
        System.out.println(e5.getAnyInt()+" ");
        System.out.println();
        e5.setAnyInt(20);
        System.out.println(e5.getAnyInt()+" ");
        System.out.println();
        e5.setAnyInt(150);
        System.out.println(e5.getAnyInt()+" ");
    }
}
