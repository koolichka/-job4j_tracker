package ru.job4j.inheritance;

public class Builder extends Engineer {

    private boolean readPlan;

    public Builder(String name, String surname, String education, String birthday,
                   char gender, boolean readPlan) {
        super(name, surname, education, birthday, gender);
        this.readPlan = readPlan;
    }

    public String getName() {
        return super.getName();
    }

    public char getGender() {
        return super.getGender();
    }
}
