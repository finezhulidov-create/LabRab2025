package lab5.example4;

public class Main4 {
    public static void main(String[] args) {
        Example4 e = new Example4('a',100);
        System.out.println(e.getOneChar()+" "+ e.getOneInt());
        Example4 e1 = new Example4(68.3456);
        System.out.println(e1.getOneInt()+ " "+ e1.getOneChar());
    }
}
