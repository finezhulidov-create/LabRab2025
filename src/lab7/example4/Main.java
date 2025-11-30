package lab7.example4;

public class Main {
    public static void main(String[] args) {
        SuperClass sup = new SuperClass('a');
        sup.copyOfSuperClass('c');
        sup.toString();
        System.out.println(sup);
        SubClass sub = new SubClass('a',"hello");
        sub.toString();
        System.out.println(sub);
        SubSubClass subSub = new SubSubClass('f',"good",243);
        subSub.toString();
        System.out.println(subSub);
    }
}
