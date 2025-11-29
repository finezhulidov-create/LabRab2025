package lab6.example8;
//Напишите программу со статическим методом,
// аргументом которому передается целочисленный массив,
// а результатом возвращается среднее значение для элементов массива
// (сумма значений элементов, деленная на количество элементов в массиве).
public class Example8 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(avgOfArrayElements(array));
    }
    public static double avgOfArrayElements(int[] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        double avg;
        avg = (double) sum /arr.length;
        return avg;
    }
}
