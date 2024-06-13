package Timus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task1521 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        List<Integer> soldiers = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            soldiers.add(i);
        }

        int index = K - 1;
        List<Integer> result = new ArrayList<>();

        while (soldiers.size() > 0) {
            index = index % soldiers.size();
            result.add(soldiers.get(index));
            soldiers.remove(index);
            index += K - 1;
        }

        for (int soldier : result) {
            System.out.print(soldier + " ");
        }
    }
}
