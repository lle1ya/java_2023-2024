package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число, которое при делении на 5 в остатке получается 2, а при делении на 7 в остатке получается 1");
        int x = in.nextInt();

        int result = x % 5;
        int result2 = x % 7;
        System.out.println("Остаток числа на деление на 5");
        System.out.println("result = " + result);
        System.out.println("Остаток числа на деление на 7");
        System.out.println("result = " + result2);

        if (result == 2 && result2 == 1 ){
            System.out.println("Условия соблюдены");
        } else {
            System.out.println("Условия не соблюдены");
        }
        in.close();
    }
}
