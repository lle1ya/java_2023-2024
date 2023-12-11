package lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = in.nextLine();

        System.out.println("Enter your age: ");
        String age = in.nextLine();

        System.out.println("Your name is " + name + " and you " + age + " years old!");
        in.close();
    }
}
