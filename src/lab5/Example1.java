package lab5;



/*Напишите программу с классом, в котором есть закрытое символьное поле и три открытых метода. Один из методов позволяет присвоить значение полю.
Еще один метод при вызове возвращает результатом код символа. Третий метод позволяет вывести в консольное окно символ (значение поля) и его код.*/
public class Example1 {
    private char charManeger;

    public void setChar(char g){
        this.charManeger = g;
    }
    public  int getCharCode(){
        return  this.charManeger;
    }
    public void printCharAndCode(){
        System.out.println("Symbol: " + this.charManeger +"  " + "Code: " + getCharCode());
    }
    public static void main(String[] args) {

        Example1 example = new Example1();
        example.setChar('h');
        example.printCharAndCode();
    }
}
