package lr3;
import java.util.Scanner;
public class Example4 {

// Версия с использованием цикла while
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("первое число: ");
        int a = in.nextInt();

        System.out.print("второе число: ");
        int b = in.nextInt();

        int i = Math.min(a, b);

        while (i <= Math.max(a, b)) {
            System.out.println(i);
            i++;
        }
        in.close();
    }

// Версия с использованием цикла for

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите первое число: ");
//        int a = in.nextInt();
//
//        System.out.print("Введите второе число: ");
//        int b = in.nextInt();
//
//        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
//            System.out.println(i);
//        }
//        in.close();
//    }

// Версия с использованием цикла do...while

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите первое число: ");
//        int a = in.nextInt();
//
//        System.out.print("Введите второе число: ");
//        int b = in.nextInt();
//
//        int i = Math.min(a, b);
//
//        do {
//            System.out.println(i);
//            i++;
//        } while (i <= Math.max(a, b));
//        in.close();
//    }
}
