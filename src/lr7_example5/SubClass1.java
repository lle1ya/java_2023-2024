package lr7_example5;

public class SubClass1 extends SuperClass {
    protected int number;

    public SubClass1(String text, int number) {
        super(text);
        this.number = number;
    }

    @Override
    public void display() {
        System.out.println("SubClass1: " + text + ", " + number);
    }
}
