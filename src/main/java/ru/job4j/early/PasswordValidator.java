package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) throws InvalidPasswordException {

        boolean hasDigit = false;
        boolean hasLetterOrDigit = false;
        boolean forbiddenValues = true;
        String[] invalidPassword = {"qwerty", "12345", "password", "admin", "user"};

        if (password != null) {

            if (password.length() < 8 || password.length() > 32) {
                throw new InvalidPasswordException(1);
            }
            if (password.equals(password.toLowerCase())) {
                throw new InvalidPasswordException(2);
            }
            if (password.equals(password.toUpperCase())) {
                throw new InvalidPasswordException(3);
            }
            for (String pass : invalidPassword) {
                if (password.toLowerCase().contains(pass.toLowerCase())) {
                    forbiddenValues = false;
                    break;
                }
            }

            for (int index = 0; index < password.length(); index++) {
                char ch = password.charAt(index);
                if (Character.isDigit(ch)) {
                    hasDigit = true;
                }
                if (ch >= 32 && ch <= 47 || ch >= 58 && ch <= 64
                        || ch >= 91 && ch <= 96 || ch >= 123 && ch <= 126) {
                    hasLetterOrDigit = true;
                }
            }

            if (!hasDigit) {
                throw new InvalidPasswordException(4);
            }
            if (!hasLetterOrDigit) {
                throw new InvalidPasswordException(5);
            }
            if (!forbiddenValues) {
                throw new InvalidPasswordException(6);
            }
            return password;
        }
        throw new IllegalArgumentException("Password is null.");
    }

   /* public static void main(String[] args) {
        try {
            System.out.println(validate("nullusekkkk1kk+qwertL"));
        } catch (InvalidPasswordException e) {
            System.out.println(e.printMessage());
        }
    }*/
}