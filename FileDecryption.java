import java.util.Scanner;

public class FileDecryption {

    public static void decrypt() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text to decrypt: ");
        String text = sc.nextLine();

        String decrypted = "";

        for (int i = 0; i < text.length(); i++) {
            decrypted += (char)(text.charAt(i) - 3);
        }

        System.out.println("Decrypted Text: " + decrypted);
    }
}