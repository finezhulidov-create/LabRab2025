package timus.task_1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Long> numbers = new ArrayList<>();

        // Чтение всех чисел из входного потока
        while (scanner.hasNextLong()) {
            numbers.add(scanner.nextLong());
        }

        // Обработка чисел в обратном порядке
        for (int i = numbers.size() - 1; i >= 0; i--) {
            long num = numbers.get(i);
            double sqrt = Math.sqrt(num);
            System.out.printf("%.4f%n", sqrt);
        }
    }
}