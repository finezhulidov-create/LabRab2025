package lab4;

import java.util.Scanner;

public class Example10 {
    public static final char[] ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ.,!?;:".toCharArray();
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
        int alphabetLen = ALPHABET.length; // dlina alphavita
        char[] chars = new char[value.length()]; //создал массив символов для получения результата
        // Перебор каждого символа в исходном тексте
        for (int i = 0; i < chars.length; i++) {
            char c = value.charAt(i);
            int index = -1;
            for (int j = 0; j < alphabetLen; j++) {
                if (ALPHABET[j] == c) {
                    index = j;
                    break;
                }
            }
            if (index != -1){
                int newIndex = (index + key)% alphabetLen;
                if (newIndex < 0){
                    newIndex += alphabetLen;
                }
                chars[i] = ALPHABET[newIndex];
            }else {
                chars[i] = c;
            }
        }

        return new String(chars);
    }
    public static String decrypt(String value, int key){

        return encrypt(value,-key);
    }
}
