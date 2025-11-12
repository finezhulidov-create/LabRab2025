package lab3;
//8. Напишите программу, в которой создается символьный массив из 10 элементов.
// Массив заполнить большими (прописными) буквами английского алфавита.
// Буквы берутся подряд, но только согласные (то есть гласные буквы ’ А',1Е' и ' I' при присваивании значений элементам массива нужно пропустить).
// Отобразите содержимое созданного массива в консольном окне.
public class Example8 {
    public static void main(String[] args) {
        int arrLength = 10;
        char[] arr = new char[arrLength];
        char firstChar = 'A';
        int i = 0;
       while (i<arrLength) {
           if (firstChar != 'A' && firstChar != 'E' && firstChar != 'I' && firstChar != 'O' && firstChar != 'U') {
               arr[i] = firstChar;
               i++;
           }
           firstChar++;
       }
            for ( i = 0; i < arrLength; i++) {
                System.out.print(arr[i] + " ");

            }
        }
    }


