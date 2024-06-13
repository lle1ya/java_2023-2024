package lr13;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("������� ������ �������: ");
        int size = scanner.nextInt();

        byte[] array = new byte[size];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("������� ������� �������: ");
            try {
                array[i] = scanner.nextByte();
                sum += array[i];
            } catch (Exception e) {
                System.out.println("������ �����. ����������, ������� ����� ����� � ��������� �� -128 �� 127.");
                scanner.next();
                i--;
            }
        }

        System.out.println("����� ��������� �������: " + sum);

        scanner.close();
    }
}
