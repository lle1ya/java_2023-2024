package lr3;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Размер массива: ");
        int arrSize = in.nextInt();

        if (arrSize <= 0) {
            System.out.println("Ошибка");
            return;
        }

        int[] array = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            array[i] = 2 + 5 * i;
        }

        for (int i = 0; i < arrSize; i++) {
            System.out.print(array[i] + " ");
        }
        in.close();
    }
}
