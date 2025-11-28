package lab6.example2;
//Напишите программу с классом, в котором есть закрытое статическое
//целочисленное ноле с начальным нулевым значением. В классе должен быть описан
//статический метод, при вызове которого отображается текущее значение статического
//поля, после чего значение поля увеличивается на единицу.
public class Example2 {
    private static int int1 = 0;
    public static void intPlus (){
        System.out.println(int1);
        int1++;

    }

    public static void main(String[] args) {
        Example2.intPlus();
        Example2.intPlus();
    }
}
