package lab4;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования: ");
        String value = in.nextLine();
        System.out.println("Введите ключ");
        int key = in.nextInt();

        char[] chars = value.toCharArray();
        int[] ints = new int[value.length()];
        for (int i = 0; i < chars.length; i++) {
            ints[i] = chars[i] + key;
            chars[i] = (char) ints[i];
        }
        String str = new String(chars);
        System.out.println("Текст после преобразования: \n" + str);
        in.nextLine();
        System.out.println("Выполнить обратное преобразование? (y/n)");
        String yOrN = in.nextLine();


        char[] chars1 = str.toCharArray();
        int[] ints1 = new int[str.length()];
        for (int i = 0; i < chars1.length; i++) {
            ints1[i] = chars1[i] - key;
            chars1[i] = (char) ints1[i];
        }
            String str1 = new String(chars1);

        if (yOrN.equalsIgnoreCase("y")) {
            System.out.println("Текст после преобразования: \n" + str1);
        }
        if (yOrN.equalsIgnoreCase("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");

        }
        }
    }


