package lab5.example6;
//Напишите программу с классом, в котором есть два закрытых целочисленных поля
// (назовем их max и min). Значение поля max не может быть меньше значения поля min.
// Значения полям присваиваются с помощью открытого метода.
// Метод может вызываться с одним или двумя целочисленными аргументами.
// При вызове метода значения полям присваиваются так:
// сравниваются текущие значения полей и значения аргументов, переданных методу.
// Самое большое из значений присваивается полю max, а самое маленькое из значений
// присваивается полю min. Предусмотрите конструктор, который работает по тому же
// принципу, что и метод для присваивания значений полям.
// В классе также должен быть метод, отображающий в консольном окне значения полей объекта.
public class Example6 {
    private int max;
    private int min;


    public  Example6(int value1, int value2) {
       if (value1 > value2) {
           this.max = value1;
           this.min = value2;
       }else {
           this.min = value1;
           this.max = value2;
       }
    }
    public Example6(int value){
        this.max = value;
        this.min = value;
    }
    public  void setValues(int value1, int value2){
        if (value1 > value2) {
            this.max = Math.max(this.max,value1);
            this.min = Math.min(this.min,value2);
        }else {
            this.min = Math.min(this.min,value1);
            this.max = Math.max(this.max, value2);
        }
    }
    public void setValues(int value){
        this.max = Math.max(this.max,value);
        this.min = Math.min(this.min,value);
    }

    public void printMaxMin(){
        System.out.println("Max: " + this.max);
        System.out.println("Min: " + this.min);
    }

}
