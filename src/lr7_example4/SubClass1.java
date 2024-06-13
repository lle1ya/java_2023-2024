package lr7_example4;

public class SubClass1 extends SuperClass{
    public String text;

    public SubClass1(char symbol, String text) {
        super(symbol);
        this.text = text;
    }

    public SubClass1(SubClass1 obj) {
        super(obj);
        this.text = obj.text;
    }
}
