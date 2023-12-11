package lr1.timus_task_1000;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int firstNumber = in.nextInt();

        System.out.println("Введите второе число: ");
        int secondNumber = in.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println("Сумма чисел равна " + sum);
        in.close();
    }
}
