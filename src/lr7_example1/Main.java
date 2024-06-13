package lr7_example1;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("Hello");
        System.out.println(superClass);

        SubClass subClass = new SubClass("World");
        System.out.println(subClass);

        SubClass subClass1 = new SubClass("Hello", "World");
        System.out.println(subClass1);

    }
}
