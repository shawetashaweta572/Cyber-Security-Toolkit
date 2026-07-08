import java.security.MessageDigest;

public class HashGenerator {

    public static void generateHash(String input) {

        try {

            MessageDigest md = MessageDigest.getInstance("SHA-256");

            byte[] hash = md.digest(input.getBytes());

            StringBuilder sb = new StringBuilder();

            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }

            System.out.println("SHA-256 Hash:");
            System.out.println(sb.toString());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}