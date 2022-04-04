package ru.job4j.oop;

public class Story {
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        WolfPetya wolfPetya = new WolfPetya();
        girl.help(petya);
        wolfPetya.eat(girl);
        petya.kill(wolfPetya);
    }
}
