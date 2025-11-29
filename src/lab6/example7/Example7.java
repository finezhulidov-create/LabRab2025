package lab6.example7;
//Напишите программу со статическим методом,
// аргументом которому передастся символьный массив,
// а результатом возвращается ссылка на целочисленным массив,
// состоящий из кодов символов из массива- аргумента
public class Example7 {
    public static int[] charArray(char[] arr) {
        int[] charCode = new int[arr.length];

        for (int i = 0; i < arr.length; i++) charCode[i] = (int) arr[i];
        return charCode;


    }
}
