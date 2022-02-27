package ru.job4j.inheritance;

public class Doctor extends Profession {

    private boolean knowLatin;

    public Doctor(String name, String surname, String education, String birthday,
                  boolean knowLatin) {
        super(name, surname, education, birthday);
        this.knowLatin = knowLatin;
    }

    public void speech() {
        if (!knowLatin) {
            System.out.println("Моментально в море");
        } else {
            System.out.println("Memento mori");
        }
    }

    public String getName() {
        return super.getName();
    }
}
