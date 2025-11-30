package lab7.example1;

public class SubClass extends SuperClass{
    private String str2;

    public SubClass(String strEx, String strEx2) {
        super(strEx);
        this.str2 = strEx2;
    }

    public SubClass(String strEx) {
        super(strEx);

    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    @Override
    public String toString() {
        String SubClassNameAndFieldValue;
         SubClassNameAndFieldValue = "SubClass" + "\n" +
                "Sub Class name: " + this.getClass().getSimpleName() + "\n" +
                 "str1=" + this.getStr1() + "\n" +
                "str2=" + this.str2 + '\'' +
                '}';
         return SubClassNameAndFieldValue;
    }
}
