package lr13;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("������� ������ �������: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        int sum = 0;
        int count = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("������� ������� �������: ");
            try {
                array[i] = scanner.nextInt();
                if (array[i] > 0) {
                    sum += array[i];
                    count++;
                }
            } catch (Exception e) {
                System.out.println("������ �����. ����������, ������� ����� �����.");
                scanner.next();
                i--;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("������� �������� ����� ������������� ���������: " + average);
        } else {
            System.out.println("������������� �������� �����������.");
        }

        scanner.close();
    }
}
