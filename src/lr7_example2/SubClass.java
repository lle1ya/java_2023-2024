package lr7_example2;

public class SubClass extends SuperClass {
    private int number;

    public SubClass(int number, String text) {
        super(text);
        this.number = number;
    }

    public void setNumber() {
        this.number = 0;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void setText(String text) {
        super.setText(text);
    }

    public int getNumber() {
        return number;
    }

    public void setTextAndNumber(String text, int number) {
        super.setText(text);
        this.number = number;
    }
}
