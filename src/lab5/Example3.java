package lab5;
//Напишите программу с классом, у которого есть два целочисленных поля.
// В классе должны быть описаны конструкторы, позволяющие создавать объекты без передачи аргументов,
// с передачей одного аргумента и с передачей двух аргументов.
public class Example3 {
    private int num1;
    private int num2;

    public Example3(int num1) {
        this.num1 = num1;
    }

    public Example3(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public static void main(String[] args) {

    }
}

