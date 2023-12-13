package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        int x = in.nextInt();

        int result = (x / 1000) % 10;

        if (result == 0) {
            System.out.println("Тысяч нет");
        } else {
            System.out.println(result + " тысяч");
        }
        in.close();
    }
}
