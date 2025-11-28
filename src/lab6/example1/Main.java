package lab6.example1;

public class Main {
    public static void main(String[] args) {
        Example1 ex = new Example1();
        ex.test('D');
        System.out.println(ex.getCh());
        ex.test("hello");
        System.out.println(ex.getStr());
        char[] chars = new char[5];
        chars[0] = 'h';
        chars[1] = 'e';
        chars[2] = 'l';
        chars[3] = 'l';
        chars[4] = 'o';
        ex.test(chars);
        System.out.println(ex.getStr());
       char[] chars1 = new char[1];
       chars1[0] = 'c';
       ex.test(chars1);
        System.out.println(ex.getCh());

    }
}
