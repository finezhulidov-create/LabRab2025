package lab7.example3;



public class Main {
    public static void main(String[] args) {
       SuperClass superClassObj = new SuperClass(10);
        String className = superClassObj.toString();
        System.out.println(className);

       SubClass subClassObj = new SubClass(15,'D');
        String subClassName = subClassObj.toString();
        System.out.println(subClassName);

        SubSubClass subSubClassObj1 = new SubSubClass(20,'g',"Hello");
        String subSubClassname = subSubClassObj1.toString();
        System.out.println(subSubClassname);
        subSubClassObj1.setValue(42,'A',"Goodbye");
        subSubClassname = subSubClassObj1.toString();
        System.out.println(subSubClassname);
    }
}
