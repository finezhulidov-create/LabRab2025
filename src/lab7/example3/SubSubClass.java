package lab7.example3;
//Напишите программу, в которой на основе суперкласса создается подкласс,
// а на основе этого подкласса создается еще один подкласс (цепочка наследования из трех классов).
// В первом суперклассе есть открытое целочисленное поле, метод с одним параметром для присваивания
// значения полю и конструктор с одним параметром. Во втором классе появляется открытое символьное поле,
// с двумя параметрами для присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя параметрами.
// В третьем классе появляется открытое текстовое ноле, метод с тремя аргументами для присваивания значений полям
// (перегрузка метода из суперкласса) и конструктор с тремя параметрами. Для каждого класса определите метод toString () так,
// чтобы он возвращал строку с названием класса и значениями всех полей объекта.
public class SubSubClass extends SubClass{
    public String str;

    public SubSubClass(int num, char ch, String str) {
        super(num, ch);
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setValue(int num, char ch, String str){
        super.setValue(ch,num);
        this.str = str;
    }
    @Override
    public String toString() {
        String SuperClassNameAndFieldValue;
        SuperClassNameAndFieldValue = "subSubClass" + "\n"+
                "Class name: " + this.getClass().getSimpleName() + "\n"+
                "str1=" + this.getStr() + "\n" +
                "str2= " + super.getNum() + "\n"+
                "str3= " + super.getCh();
        return SuperClassNameAndFieldValue;
    }

}
