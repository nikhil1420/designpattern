package dev.nikhil.structural.decorator.addon;

import dev.nikhil.structural.decorator.Beverage;

public class Milk implements Beverage {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public int getCost() {
        return 30 + beverage.getCost();
    }
}
