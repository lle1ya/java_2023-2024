package lr7_example5;

public class Main {
    public static void main(String[] args) {
        SuperClass obj1 = new SuperClass("Hello");
        obj1.display();

        SubClass1 obj2 = new SubClass1("World", 10);
        obj2.display();

        SubClass2 obj3 = new SubClass2("Java", 'B');
        obj3.display();

        SuperClass obj4 = new SubClass1("JavaLove", 20);
        obj4.display();

        SuperClass obj5 = new SubClass2("Language", 'C');
        obj5.display();
    }
}
