package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    public String generate(String name, String body) {
        String sls = System.lineSeparator();
        return "{" + sls + "\t\"name\" : \"" + name + "\","
                + sls + "\t\"body\" : \"" + body + "\"" + sls + "}";
    }
}
