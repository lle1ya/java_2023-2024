package lr2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число, которое делится на 3 без остатка");
        int x = in.nextInt();

        int result = x % 3;
        System.out.println("Остаток числа на деление на 3");
        System.out.println("result = " + result);

        if (result == 0){
            System.out.println("Условия соблюдены, остаток равен нулю");
        } else {
            System.out.println("Условия не соблюдены, остаток не равен нулю");
        }
        in.close();
    }
}
