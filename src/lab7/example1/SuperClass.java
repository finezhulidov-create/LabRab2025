package lab7.example1;
//1. Напишите программу, в которой есть суперкласс с приватным текстовым полем,
// конструктором с текстовым параметром и где переопределен метод toString ().
// На основе суперкласса путем наследования создается подкласс.
// У него появляется еще одно приватное текстовое ноле.
// Также подкласс должен иметь версии конструктора с одним и двумя текстовыми аргументами,
// а еще в нем должен быть переопределен метод toString ().
// В обоих классах метод toString () переопределяется так, что он возвращает строку с названием класса
// и значение текстового поля или текстовых полей.
public class SuperClass {
    private String str1;


    public SuperClass(String strEx) {
        this.str1 = strEx;
    }



    public String getStr1() {
        return str1;
    }

    @Override
    public String toString() {
        String SuperClassNameAndFieldValue;
        SuperClassNameAndFieldValue = "super" + "\n"+
                "Class name: " + this.getClass().getSimpleName() + "\n"+
                "str1=" + this.getStr1();
        return SuperClassNameAndFieldValue;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }
}
