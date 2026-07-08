import java.util.Random;

public class PasswordGenerator {

    public static void generate() {

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%&*";

        Random random = new Random();

        String password = "";

        for (int i = 0; i < 12; i++) {
            password += chars.charAt(random.nextInt(chars.length()));
        }

        System.out.println("Generated Password: " + password);
    }
}