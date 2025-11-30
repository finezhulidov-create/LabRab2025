package lab7.example5;
//5. Напишите программу, в которой есть суперкласс с приватным текстовым полем, конструктор с текстовым параметром и метод,
// при вызове которого в консольном окне отображается название класса и значение поля.
// На основе суперкласса создаются два подкласса (оба на основе одного и того же суперкласса).
// В одном из классов появляется защищенное целочисленное поле,
// там есть конструктор с двумя параметрами и переопределен метод для отображения значений полей объекта и названия класса.
// Во втором подклассе появляется защищенное символьное поле, конструктор с двумя параметрами и переопределен метод,
// отображающий в консоли название класса и значения полей. В главном методе создайте объекты каждого из классов.
// Проверьте работу метода, отображающего значения полей объектов, для каждого из объектов.
// Вызовите этот же метод через объектную переменную суперкласса, которая ссылается на объект производного класса.

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("Hello");
        String toString1 = superClass.toString();
        System.out.println(toString1);
        superClass.showClass();
        SubClass1 subClass1 = new SubClass1("hello", 23);
        String toString2 = subClass1.toString();
        System.out.println(toString2);
        subClass1.showClass();

        SubClass2 subClass2 = new SubClass2("Hello", 'A');
        String toString3 = subClass2.toString();
        System.out.println(toString3);
        subClass2.showClass();

        SuperClass superClass1 = new SubClass1("hi",1231243);
        superClass1.showClass();

        SuperClass superClass2 = new SubClass2("go",'A');
        superClass2.showClass();
    }
}

