package lab5.example4;
//Напишите программу с классом, у которого есть символьное и целочисленное поле.
// В классе должны быть описаны версии конструктора с двумя аргументами (целое число и символ – определяют значения полей),
// а также с одним аргументом типа double. В последнем случае действительная часть аргумента определяет код символа (значение символьного поля),
// а дробная часть (с учетом десятых и сотых) определяет значение целочисленного поля. Например, если аргументом передается число 65.1267,
// то значением символьного поля будет символ ‘A’ с годом 65, а целочисленное поле получит значение 12 (в дробной части учитываются только десятые и сотые).
public class Example4 {
    private char oneChar;
    private int oneInt;

    public Example4(char oneChar, int oneInt) {
        this.oneChar = oneChar;
        this.oneInt = oneInt;
    }

    public Example4(double doubleValue) {
        this.oneInt = (int) (doubleValue - this.oneInt);;
        this.oneChar = (char) doubleValue;
    }

    public char getOneChar() {
        return oneChar;
    }

    public int getOneInt() {
        return oneInt;
    }
}
