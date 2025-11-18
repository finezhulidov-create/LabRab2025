package lab4;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования: ");
        String value = in.nextLine();
        System.out.println("Введите ключ");
        int key = in.nextInt();
        String encriptedText = encrypt(value, key);
        System.out.println("Текст после преобразования: \n" + encriptedText);
        in.nextLine();
        while(true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String answer = in.nextLine();
            if (answer.equalsIgnoreCase("y")){
                String decryptedText = decrypt(encriptedText, key);
                System.out.println("Обратно преобразованный текст: " + decryptedText);
                break;
            } else if (answer.equalsIgnoreCase("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }
        in.close();
    }
    public static String encrypt(String value, int key){
        char[] chars = value.toCharArray();
        int[] ints = new int[value.length()];
        for (int i = 0; i < chars.length; i++) {
            ints[i] = chars[i] + key;
            chars[i] = (char) ints[i];
        }
        String str = new String(chars);
        return str;
    }
    public static String decrypt(String encriptedText, int key){
        char[] chars1 = encriptedText.toCharArray();
        int[] ints1 = new int[encriptedText.length()];
        for (int i = 0; i < chars1.length; i++) {
            ints1[i] = chars1[i] - key;
            chars1[i] = (char) ints1[i];
        }
        String str1 = new String(chars1);

        return str1;
        }
    }


