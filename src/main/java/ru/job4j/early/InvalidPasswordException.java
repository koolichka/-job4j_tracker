package ru.job4j.early;

public class InvalidPasswordException extends Exception {

    int passwordConditionViolated = 0;

    public InvalidPasswordException(int conditionViolated) {

        this.passwordConditionViolated = conditionViolated;
    }

    public String printMessage() {
        switch (passwordConditionViolated) {
            case 1:
                return ("The password length cannot be less than 8 or more than 32 characters.");
            case 2:
                return ("The password must contain uppercase character.");
            case 3:
                return ("The password must contain lowercase character.");
            case 4:
                return ("The password must contain a digit.");
            case 5:
                return ("The password must contain special character.");
            case 6:
                return ("The password contains forbidden values.");
            default:
        }
        return ("");
    }
}
