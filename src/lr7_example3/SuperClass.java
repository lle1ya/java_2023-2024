package lr7_example3;

public class SuperClass {
    public int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public SuperClass(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "SuperClass: number = " + number;
    }
}
