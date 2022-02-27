package ru.job4j.inheritance;

public class Engineer extends Profession {

    private char gender;

    public Engineer(String name, String surname, String education, String birthday,
                    char gender) {
        super(name, surname, education, birthday);
        this.gender = gender;
    }

    public void engineerEducation() {
        super.getEducation();
    }

    public char getGender() {
        return gender;
    }

}
