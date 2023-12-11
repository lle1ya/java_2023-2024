package lr1;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your Last Name: ");
        String lastName = in.nextLine();

        System.out.println("Enter your First Name: ");
        String fitstName = in.nextLine();

        System.out.println("Enter your First Name: ");
        String middleName = in.nextLine();

        System.out.println("Hello " + lastName + " " + fitstName + " " + middleName);
        in.close();
    }
}
