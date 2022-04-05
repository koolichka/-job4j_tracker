package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private boolean gangrene;

    public Surgeon(String name, String surname, String education, String birthday,
                   boolean knowLatin, boolean gangrene) {
        super(name, surname, education, birthday, knowLatin);
        this.gangrene = gangrene;
    }

    public void cut() {
        if (!gangrene) {
            System.out.println("Don't cut the leg.");
        } else {
            System.out.println("Cut the leg.");
        }
    }

    public void speech() {
        super.speech();
    }
}
