package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                return user;
            }
            if (!login.equals(user.getUsername())) {
                throw new UserNotFoundException("User not found.");
            }
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 3 || !user.isValid()) {
            throw new UserInvalidException("User is not valid.");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {new User("Andrey Kulikov", true)};
        try {
            User user = findUser(users, "Andrey Kulikov");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ei) {
            ei.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}

