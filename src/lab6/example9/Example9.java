package lab6.example9;



//9. Напишите программу со статическим методом, аргументом которому передается одномерный символьный массив.
// В результате вызова метода элементы массива попарно меняются местами: первый — с последним, второй — с предпоследним и так далее.
public class Example9 {
    public static void changeElementsOfArray(char[] arr){

       int end = arr.length-1;

        for (int start = 0; start < end; start++) {
                char tmp = arr[start];
                arr[start] = arr[end];
                arr[end] =tmp;
                end--;
        }
    }

    public static void main(String[] args) {
        char[] array = {'a','b','c','d','e'};
        changeElementsOfArray(array);
        System.out.println(array);
    }
}
