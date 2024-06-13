package lr7_example3;

public class SubClass2 extends SubClass1 {
    public String text;

    public SubClass2(int number, char symbol, String text) {
        super(number, symbol);
        this.text = text;
    }

    public void setValues(String text) {
        super.setNumberAndSymbol(number, symbol);
        this.text = text;
    }

    @Override
    public String toString() {
        return "SubClass2: number = " + number + ", symbol = " + symbol + ", text = " + text;
    }
}
