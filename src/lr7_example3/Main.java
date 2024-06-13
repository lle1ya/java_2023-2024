package lr7_example3;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass(12);
        System.out.println(superClass);

        SubClass1 subClass1 = new SubClass1(10, 'F');
        System.out.println(subClass1);

        SubClass2 subClass2 = new SubClass2(9, 'T', "hello");
        System.out.println(subClass2);
    }
}
