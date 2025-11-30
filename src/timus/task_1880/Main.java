package timus.task_1880;
//Входные данные состоят из трёх блоков по две строки. Первая строка каждого блока содержит целое число n —количество собственных чисел очередного игрока
// (1 ≤ n ≤ 4 000). Во второй строке блока записано n целых различных чисел в порядке возрастания — собственные числа очередного игрока.
// Все собственные числа — целые, положительные и не превосходят 109.
//Результат
//Выведите количество собственных чисел команды Psych Up.
//Пример
//исходные данные	результат
//
//5
//13 20 22 43 146
//4
//13 22 43 146
//5
//13 43 67 89 146
//
//
//
//3
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int size1 = Integer.parseInt(scanner.nextLine());
        String[] strings1 = scanner.nextLine().split(" ");
        int size2 = Integer.parseInt(scanner.nextLine());
        String[] strings2 = scanner.nextLine().split(" ");
        int size3 = Integer.parseInt(scanner.nextLine());
        String[] strings3 = scanner.nextLine().split(" ");
        String[] strings = new String[size1+size2+size3];
        for (int i = 0, x = 0, y = 0; i < size1+size2+size3; i++) {
            if (i<size1){
                strings[i] = strings1[i];
                continue;
            }
            if (i<(size1+size2)){
                strings[i] = strings2[x];
                x++;
                continue;
            }
            strings[i] = strings3[y];
            y++;

        }
        Arrays.sort(strings);
        int count = 0;
        for (int i = 1; i <strings.length-1 ; i++) {
            if(strings[i-1].equals(strings[i])&& strings[i].equals(strings[i+1])){
                count++;
            }

        }
        System.out.println(count);
    }
}
