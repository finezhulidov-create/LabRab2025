package lab6.example3;
//Напишите программу с классом, в котором есть статические методы, которым
//можно передавать произвольное количество целочисленных аргументов (или
//целочисленный массив). Методы, на основании переданных аргументов или массива,
//позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
//значение из набора чисел.
public class Example3 {
    public static int intMax (int... numbers){
        int maxValue = Integer.MIN_VALUE;
        for (int num:numbers){
            if (num>maxValue){
                maxValue = num;
            }
        }
        return maxValue;
    }
    public static int intMin (int... numbers){
            int minValue = Integer.MAX_VALUE;
            for (int num: numbers){
                if (num<minValue){
                    minValue = num;
                }
            }
            return minValue;
    }
    public static int intAver (int... numbers){
        long sum = 0L;
        for (int num: numbers){
            sum += num;
        }
        return (int) (sum/numbers.length);

    }
}
