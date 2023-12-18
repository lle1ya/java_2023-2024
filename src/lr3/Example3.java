package lr3;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = in.nextInt();

        int a = 1;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
        in.close();
    }
}
