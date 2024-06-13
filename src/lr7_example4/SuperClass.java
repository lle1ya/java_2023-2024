package lr7_example4;

public class SuperClass {
    public char symbol;

    public SuperClass(char symbol) {
        this.symbol = symbol;
    }

    public SuperClass(SuperClass obj) {
        this.symbol = obj.symbol;
    }
}
