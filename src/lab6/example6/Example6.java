package lab6.example6;
//6. Напишите программу со статическим методом,
// которому аргументом передается целочисленный массив и целое число.
// Результатом метод возвращает ссылку на новый массив,
// который получается из исходного массива (переданного первым аргументом методу),
// если в нем взять несколько начальных элементов.
// Количество элементов, которые нужно взять из исходного массива,
// определяются вторым аргументом метода.
// Если второй аргумент метода больше длины массива, переданного первым аргументом,
// tо методом создается копия исходного массива и возвращается ссылка на эту копию.
public class Example6 {
    public static int[] intArrChange(int[] arr,int numOfElements){
        if (numOfElements>= arr.length){
            return arr;
        }
        int[] newArray = new int[numOfElements];
        for (int i = 0; i < numOfElements; i++) {
            newArray[i] = arr[i];

        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arrInt = new int[3];
        arrInt[0] = 2;
        arrInt[1] = 15;
        arrInt[2] = 8;

        int[] arrayResult = Example6.intArrChange(arrInt, 2);
        System.out.println(arrayResult);
    }
}
