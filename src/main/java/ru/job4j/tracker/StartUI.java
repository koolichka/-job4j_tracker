package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI extends Item {
    public static void main(String[] args) {
        Item item = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = item.getDateTime().format(formatter);
        System.out.println(currentDateTimeFormat);
        System.out.println("");
        Item item1 = new Item();
        System.out.println(item1);
    }
}
