import java.util.Scanner;

public class FileEncryption {

    public static void encrypt() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text to encrypt: ");
        String text = sc.nextLine();

        String encrypted = "";

        for (int i = 0; i < text.length(); i++) {
            encrypted += (char)(text.charAt(i) + 3);
        }

        System.out.println("Encrypted Text: " + encrypted);
    }
}