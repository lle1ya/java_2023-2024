package lr3;

public class Example7 {
    public static void main(String[] args) {
        char[] charArray = new char[10];
        int x = 0;
        for (int i = 0; i < 10; i++) {
            charArray[i] = (char) ('\u0061' + i + x++);
        }
        for (char i: charArray) {
            System.out.println(i);
        }
        System.out.println();
        for (int i = 9; i >= 0; i--) {
            System.out.println(charArray[i]);
        }
    }
}
