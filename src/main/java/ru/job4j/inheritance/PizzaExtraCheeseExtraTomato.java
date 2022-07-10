package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private static final String PIZZANAMECHEESETOMATO = " + extra tomato";

    public PizzaExtraCheeseExtraTomato() {
    }

    public PizzaExtraCheeseExtraTomato(String name) {
        super(name);
    }

    @Override
    public String name() {
        return super.name() + PIZZANAMECHEESETOMATO;
    }
}
