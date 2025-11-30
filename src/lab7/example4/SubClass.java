package lab7.example4;
//4. Напишите программу, в которой использована цепочка наследования из трех классов.
// В первом классе есть открытое символьное поле. Во втором классе появляется открытое текстовое поле.
// В третьем классе появляется открытое целочисленное поле.
// В каждом из классов должен быть конструктор, позволяющий создавать объект на основе значений полей,
// переданных аргументами конструктору, а также конструктор создания копии.

public class SubClass extends SuperClass{
    public String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public SubClass(char ch, String str) {
        super(ch);
        this.str = str;
    }
    public SubClass copyOfSubClass(char ch,String str){
        SubClass copyOfSubClass = new SubClass(ch,str);
        copyOfSubClass.str = this.str;
        copyOfSubClass.ch = super.ch;
        return copyOfSubClass;
    }

    @Override
    public String toString() {
        return "SubClass{" + getClass().getSimpleName()+
                " str='" + this.str + '\'' +
                ", ch=" + super.ch +
                '}';
    }
}
