public class PasswordStrengthChecker {

    public static void check(String password) {

        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean special = false;

        for (char ch : password.toCharArray()) {

            if (Character.isUpperCase(ch))
                upper = true;
            else if (Character.isLowerCase(ch))
                lower = true;
            else if (Character.isDigit(ch))
                digit = true;
            else
                special = true;
        }

        if (password.length() >= 8 && upper && lower && digit && special) {
            System.out.println("Strong Password");
        } else if (password.length() >= 6) {
            System.out.println("Medium Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}