package lr13;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        int sum = 0;
        int count = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент массива: ");
            try {
                array[i] = scanner.nextInt();
                if (array[i] > 0) {
                    sum += array[i];
                    count++;
                }
            } catch (Exception e) {
                System.out.println("Ошибка ввода. Пожалуйста, введите целое число.");
                scanner.next();
                i--;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Среднее значение среди положительных элементов: " + average);
        } else {
            System.out.println("Положительные элементы отсутствуют.");
        }

        scanner.close();
    }
}
