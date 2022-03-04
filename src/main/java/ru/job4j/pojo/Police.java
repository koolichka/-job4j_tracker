package ru.job4j.pojo;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Andrey Kulikov");
        license.setModel("Opel");
        license.setCode("o666oo");
        license.setCreated(new Date());

        System.out.println(license.getOwner() + " has a car - " + license.getModel() + " : " + license.getCode());
    }
}
