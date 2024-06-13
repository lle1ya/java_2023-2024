package lr7_example2;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("Hello");
        System.out.println(superClass.getLength());

        SubClass subClass = new SubClass(10, "World");
        System.out.println(subClass.getLength());
        System.out.println(subClass.getNumber());

        subClass.setTextAndNumber("Java" , 20);
        System.out.println(subClass.getLength());
        System.out.println(subClass.getNumber());
    }
}
