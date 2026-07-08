import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("   CYBER SECURITY TOOLKIT");
        System.out.println("==================================");
        System.out.println("1. Password Strength Checker");
        System.out.println("2. Password Generator");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        switch(choice) {

            case 1:
                System.out.print("Enter Password: ");
                String password = sc.nextLine();
                PasswordStrengthChecker.check(password);
                break;

            case 2:
                PasswordGenerator.generate();
                break;

            default:
                System.out.println("Thank You!");
        }

        sc.close();
    }
}