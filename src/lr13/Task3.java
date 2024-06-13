package lr13;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        byte[] array = new byte[size];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент массива: ");
            try {
                array[i] = scanner.nextByte();
                sum += array[i];
            } catch (Exception e) {
                System.out.println("Ошибка ввода. Пожалуйста, введите целое число в диапазоне от -128 до 127.");
                scanner.next();
                i--;
            }
        }

        System.out.println("Сумма элементов массива: " + sum);

        scanner.close();
    }
}
