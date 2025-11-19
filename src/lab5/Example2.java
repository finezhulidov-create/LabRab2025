package lab5;
//Напишите программу с классом, у которого есть два символьных поля и метод.
// Он возвращает результат, и у него нет аргументов.
// При вызове метод выводит в консольное окно все символы из кодовой таблицы,
// которые находятся «между» символами, являющимися значениями полей объекта (из которого вызывается метод).
// Например, если полям объекта присвоены значения ‘A’ и ‘D’,
// то при вызове метода в консольное окно должны выводиться все символы от ‘A’ до ‘D’ включительно.
public class Example2 {
    public char charOne;
    public char charTwo;

    public Example2(char charOne, char charTwo) {
        this.charOne = charOne;
        this.charTwo = charTwo;
    }

    public void simbols(){
        for (char i = charOne; i <= charTwo ; i++) {
            System.out.print(i+" ");

        }
    }

    public static void main(String[] args) {
            Example2 s = new Example2('A', 'G');
            s.simbols();
    }
}
