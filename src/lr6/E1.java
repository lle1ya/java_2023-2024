package lr6;

public class E1 {
    private char symbol;
    private String text;

    public E1() {
        this.symbol = ' ';
        this.text = "";
    }

    public void setValue(char symbol) {
        this.symbol = symbol;
    }

    public void setValue(String text) {
        this.text = text;
    }

    public void setValue(char[] array) {
        if (array.length == 1) {
            this.symbol = array[0];
        } else {
            this.text = new String(array);
        }
    }

    public void printValues() {
        System.out.println("symbol: " + this.symbol);
        System.out.println("text: " + this.text);
    }
}
