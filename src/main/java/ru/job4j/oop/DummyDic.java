package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        String text = "Неизвестное слово. " + eng;
        return text;
    }

    public static void main(String[] args) {
        DummyDic dummy = new DummyDic();
        System.out.println(dummy.engToRus("blablabla"));
    }
}
