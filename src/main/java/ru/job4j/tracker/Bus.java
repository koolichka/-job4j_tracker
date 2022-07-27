package ru.job4j.tracker;

public class Bus implements Transport {
    private int fuelCost = 52;

    @Override
    public void ride(boolean ride) {

    }

    @Override
    public void passengers(int numberOfPassengers) {

    }

    @Override
    public int fuel(int fuelQuantity) {
        return fuelQuantity * fuelCost;
    }
}
