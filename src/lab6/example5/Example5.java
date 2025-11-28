package lab6.example5;
//5. Напишите программу со статическим методом,
// которым вычисляется сумма квадратов натуральных чисел 12 + 22 + 32 + ... + п2.
// Число п передается аргументом методу.
// Для проверки результата можно использовать формулу 12 + 22 +32+…+n2=(n+l) (2n + 1)/6
public class Example5 {
    public static long sumSqrt(int num){
        long sum = 0;
        for (int i = 1; i <=num ; i++) {
            sum += (long)i*i;

        }
        return sum;
    }
    public static long sumSqrtFormula(int num){
        return (long) num*(num+1)*(2L *num+1)/6;
    }
}
