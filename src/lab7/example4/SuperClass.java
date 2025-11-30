package lab7.example4;
//4. Напишите программу, в которой использована цепочка наследования из трех классов.
// В первом классе есть открытое символьное поле. Во втором классе появляется открытое текстовое поле.
// В третьем классе появляется открытое целочисленное поле.
// В каждом из классов должен быть конструктор, позволяющий создавать объект на основе значений полей,
// переданных аргументами конструктору, а также конструктор создания копии.
public class SuperClass {
    public char ch;

    public SuperClass(char ch) {
        this.ch = ch;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }
    public SuperClass copyOfSuperClass(char ch){
        SuperClass copyOfSuperClass = new SuperClass(ch);
        copyOfSuperClass.ch = this.ch;
        return copyOfSuperClass;
    }

    @Override
    public String toString() {
        return "SuperClass{" + getClass().getSimpleName()+
                " ch=" + this.ch +
                '}';
    }
}
