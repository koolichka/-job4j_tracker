package ru.job4j.inheritance;

public class Dentist extends Doctor {

    public boolean caries;

    public Dentist(String name, String surname, String education, String birthday,
                   boolean knowLatin, boolean caries) {
        super(name, surname, education, birthday, knowLatin);
        this.caries = caries;
    }

    public void remove() {
        if (!caries) {
            System.out.println("Don't remove a tooth.");
        } else {
            System.out.println("Remove a tooth.");
        }
    }

}
