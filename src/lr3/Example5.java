package lr3;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = in.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            if (i % 5 == 2 || i % 3 == 1) {
                sum += i;

                System.out.println(i);
            }
            i++;
        }

        System.out.println("Сумма: " + sum);
        in.close();
    }
// Версия с использованием цикла for

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите число: ");
//        int n = in.nextInt();
//
//        int sum = 0;
//
//        for (int i = 1; i <= n; i++) {
//            if (i % 5 == 2 || i % 3 == 1) {
//                sum += i;
//
//                System.out.println(i);
//            }
//        }
//
//        System.out.println("Сумма: " + sum);
//    in.close();
//    }

//    Версия с использованием цикла do...while

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите число: ");
//        int n = in.nextInt();
//
//        int sum = 0;
//        int i = 1;
//
//        do {
//            if (i % 5 == 2 || i % 3 == 1) {
//                sum += i;
//
//                System.out.println(i);
//            }
//            i++;
//        }
//        while (i <= n);
//
//        System.out.println("Сумма: " + sum);
//    in.close();
//    }
}
