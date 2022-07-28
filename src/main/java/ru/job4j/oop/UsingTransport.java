package ru.job4j.oop;

public class UsingTransport {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();

        Vehicle[] vehicle = new Vehicle[] {plane, train, bus};
        for (Vehicle v : vehicle) {
            v.move();
            v.fuelType();
        }
    }
}
