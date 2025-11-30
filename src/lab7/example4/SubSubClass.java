package lab7.example4;
//4. Напишите программу, в которой использована цепочка наследования из трех классов.
// В первом классе есть открытое символьное поле. Во втором классе появляется открытое текстовое поле.
// В третьем классе появляется открытое целочисленное поле.
// В каждом из классов должен быть конструктор, позволяющий создавать объект на основе значений полей,
// переданных аргументами конструктору, а также конструктор создания копии.

public class SubSubClass extends SubClass{
    public int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public SubSubClass(char ch, String str, int num) {
        super(ch, str);
        this.num = num;
    }
    public SubSubClass copyOfSubSubClass(char ch,String str,int num){
        SubSubClass copyOfSubSubClass = new SubSubClass(ch,str,num);
        copyOfSubSubClass.str = super.str;
        copyOfSubSubClass.ch = super.ch;
        copyOfSubSubClass.num = this.num;
        return copyOfSubSubClass;
    }

    @Override
    public String toString() {
        return "SubSubClass{" + getClass().getSimpleName()+
                " num=" + this.num +
                ", str='" + super.str + '\'' +
                ", ch=" + super.ch +
                '}';
    }
}
