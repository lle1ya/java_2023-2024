package lr6;

public class Example1 {
    public static void main(String[] args) {
        E1 instance = new E1();

        instance.setValue('a');
        instance.printValues();

        instance.setValue("Hello, wrld!");
        instance.printValues();

        char[] array = {'a', 'b', 'c'};
        instance.setValue(array);
        instance.printValues();
    }
}
