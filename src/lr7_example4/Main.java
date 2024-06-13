package lr7_example4;

public class Main {
    public static void main(String[] args) {
        SubClass2 subClass2 = new SubClass2('A',"Hello",10);
        SubClass2 subClass21 = new SubClass2(subClass2);

        System.out.println("obj1: symbol=" + subClass2.symbol + ", text=" + subClass2.text + ", number=" + subClass2.number);
        System.out.println("obj2: symbol=" + subClass21.symbol + ", text=" + subClass21.text + ", number=" + subClass21.number);
    }
}
