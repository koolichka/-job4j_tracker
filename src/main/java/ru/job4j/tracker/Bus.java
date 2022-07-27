package ru.job4j.tracker;

public class Bus implements Transport {
    private int fuelCost = 52;

    @Override
    public void ride() {
        System.out.println("Let's ride!");
    }

    @Override
    public void passengers(int numberOfPassengers) {
        System.out.println("Количество пассажиров: " + numberOfPassengers);
    }

    @Override
    public int fuel(int fuelQuantity) {
        return fuelQuantity * fuelCost;
    }
}
