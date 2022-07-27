package ru.job4j.tracker;

public interface Transport {
    void ride(boolean ride);

    void passengers(int numberOfPassengers);

    int fuel(int fuelQuantity);
}
