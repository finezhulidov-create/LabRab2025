package lab7.example2;

public class Main {
    public static void main(String[] args) {
        SubClass obj = new SubClass("hello", 10);
        System.out.println("Get lenght= " + obj.getLenght());
        obj.setValues();
        obj.setValues("hello world!");
        System.out.println("Get lenght= " + obj.getLenght());
    }
}
