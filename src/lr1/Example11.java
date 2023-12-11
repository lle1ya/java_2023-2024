package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = in.nextLine();

        System.out.println("Enter your the year of birth: ");
        int birthYear = in.nextInt();

        int currentYear  = LocalDate.now().getYear();
        int age = currentYear - birthYear;

        System.out.println("Your name is " + name + " and your age is " + age + " years.");
        in.close();
    }
}
