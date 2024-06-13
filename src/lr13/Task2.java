package lr13;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("������� ���������� ����� �������: ");
        int rows = scanner.nextInt();
        System.out.print("������� ���������� �������� �������: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.print("������� ����� ������� ��� ������: ");
        int columnNumber = 0;
        try {
            columnNumber = scanner.nextInt();
            if (columnNumber < 1 || columnNumber > cols) {
                throw new IllegalArgumentException("����� ������� ��� ���������.");
            }
        } catch (Exception e) {
            System.out.println("������ �����. ����������, ������� ����� ����� � ��������� �� 1 �� " + cols + ".");
            System.exit(0);
        }

        System.out.println("������� � ������� " + columnNumber + ":");
        for (int i = 0; i < rows; i++) {
            System.out.println(matrix[i][columnNumber - 1]);
        }

        scanner.close();
    }
}
