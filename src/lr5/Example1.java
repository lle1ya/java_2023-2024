package lr5;

public class Example1 {
    public static void main(String[] args) {
        var instance = new E1();
        instance.setSymbol('y');

        System.out.println(instance.getCode());

        instance.print();
    }
}
