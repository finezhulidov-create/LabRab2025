package lab3;

//7. Напишите программу, в которой создается одномерный символьный массив из 10 элементов.
// Массив заполняется буквами «через одну», начиная с буквы ' а ': то есть массив заполняется буквами 'а', 'с', ' е', 'д' и так далее.
// Отобразите массив в консольном окне в прямом и обратном порядке. Размер массива задается переменной.
public class Example7 {
    public static void main(String[] args) {
        int arrLen = 10;
        char[] arr = new char[arrLen];
        char firstChar = 'a';
        for (int i = 0; i < arrLen; i++) {
            arr[i] = firstChar;
            firstChar++;

        }
        for (int i = 0; i < arrLen; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for (int i = arrLen-1; i >= 0 ; i--) {
            System.out.print( arr[i]+ " ");
        }
        System.out.println();
    }
}
