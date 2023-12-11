package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter today's day of the week: ");
        String dayOfWeek = in.nextLine();

        System.out.println("What about month name?: ");
        String month = in.nextLine();

        System.out.println("Date (day number): ");
        int date = in.nextInt();

        System.out.println("Today " + dayOfWeek + " " + date + " " + month);
        in.close();
    }
}
