package lab7.example1;

public class Main {
    public static void main(String[] args) {
        SuperClass superClassObj = new SuperClass("передал в конструктор супер класса");
        String className = superClassObj.toString();
        System.out.println(className);

        SubClass subClassObj = new SubClass("передал в конструктор суб класса");
        String subClassName = subClassObj.toString();
        System.out.println(subClassName);

        SubClass subClassObj1 = new SubClass("передал в конструктор, ", "где два параметра");
        String subClassName1 = subClassObj1.toString();
        System.out.println(subClassName1);
    }

}
