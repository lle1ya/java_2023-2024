package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = in.nextInt();

        int currentYear = LocalDate.now().getYear();

        int birthYear = currentYear - age;

        System.out.println("Your year of birth is " + birthYear + " years.");
        in.close();
    }
}
