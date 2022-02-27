package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private int timeToSleep;

    public Programmer(String name, String surname, String education, String birthday,
                      char gender, int timeToSleep) {
        super(name, surname, education, birthday, gender);
        this.timeToSleep = timeToSleep;
    }

    public char getGender() {
        return super.getGender();
    }
}
