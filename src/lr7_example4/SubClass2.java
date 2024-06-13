package lr7_example4;

public class SubClass2 extends SubClass1{
    public int number;

    public SubClass2(char symbol, String text, int number) {
        super(symbol, text);
        this.number = number;
    }

    public SubClass2(SubClass2 obj) {
        super(obj);
        this.number = obj.number;
    }
}
