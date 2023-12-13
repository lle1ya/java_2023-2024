package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число, которое попадает в диапазон от 5 до 10 включительно");
        int x = in.nextInt();

        if (x >= 5 && x <= 10 ){
            System.out.println("Условия соблюдены");
        } else {
            System.out.println("Условия не соблюдены");
        }
        in.close();
    }
}
