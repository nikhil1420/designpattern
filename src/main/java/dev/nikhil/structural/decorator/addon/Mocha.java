package dev.nikhil.structural.decorator.addon;

import dev.nikhil.structural.decorator.Beverage;

public class Mocha implements Beverage {

    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public int getCost() {
        return 60 + beverage.getCost();
    }
}
