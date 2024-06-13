package lr7_example5;

public class SuperClass {
    protected String text;

    public SuperClass(String text) {
        this.text = text;
    }

    public void display() {
        System.out.println("SuperClass:" + text);
    }
}
