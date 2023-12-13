package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число, которое делится на 4, и при этом оно не меньше 10");
        int x = in.nextInt();

        int result = x % 4;
        System.out.println("Остаток числа на деление на 4");
        System.out.println("result = " + result);

        if (result == 0 && x > 10 ){
            System.out.println("Условия соблюдены");
        } else {
            System.out.println("Условия не соблюдены");
        }
        in.close();
    }
}
