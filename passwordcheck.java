public class PasswordCheck {
    public static String checkPasswordStrength(String password) {
        int passwordLength = password.length();
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (int i = 0; i < passwordLength; i++) {
            char c = password.charAt(i);
            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }

        if (passwordLength < 8 || !hasLowerCase || !hasUpperCase || !hasDigit || !hasSpecialChar) {
            return "weak";
        } else if (passwordLength < 12) {
            return "medium";
        } else {
            return "strong";
        }
    }
}