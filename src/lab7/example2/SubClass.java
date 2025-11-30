package lab7.example2;

public class SubClass extends SuperClass {
    public int int1;

    public SubClass(String str1, int int1) {
        super(str1);
        this.int1 = int1;
    }

    public int getInt1() {
        return int1;
    }

    public void setValues(int int1) {
        this.int1 = int1;
    }
    public void setValues(String str1){
        super.setStr1(str1);
    }
    public void setValues(String str1, int int1){
        super.setStr1(str1);
        this.int1 = int1;
    }
    public void setValues(){
        System.out.println("constructor without parameter");
    }

    @Override
    public void setStr1(String str1){
        super.setStr1(str1);
    }
}
