package lr7_example3;

public class SubClass1 extends SuperClass {
    public char symbol;

    public SubClass1(int number, char symbol) {
        super(number);
        this.symbol = symbol;
    }
    public void setNumberAndSymbol(int number, char symbol) {
        super.setNumber(number);
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "SubClass1: number = " + number + ", symbol = " + symbol;
    }
}
