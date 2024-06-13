package lr13;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк матрицы: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.print("Введите номер столбца для вывода: ");
        int columnNumber = 0;
        try {
            columnNumber = scanner.nextInt();
            if (columnNumber < 1 || columnNumber > cols) {
                throw new IllegalArgumentException("Номер столбца вне диапазона.");
            }
        } catch (Exception e) {
            System.out.println("Ошибка ввода. Пожалуйста, введите целое число в диапазоне от 1 до " + cols + ".");
            System.exit(0);
        }

        System.out.println("Столбец с номером " + columnNumber + ":");
        for (int i = 0; i < rows; i++) {
            System.out.println(matrix[i][columnNumber - 1]);
        }

        scanner.close();
    }
}
