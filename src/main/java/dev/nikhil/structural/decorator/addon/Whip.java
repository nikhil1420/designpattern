package dev.nikhil.structural.decorator.addon;

import dev.nikhil.structural.decorator.Beverage;

public class Whip implements Beverage{
   Beverage beverage;
   public Whip(Beverage beverage) {
       this.beverage = beverage;
   }
    @Override
    public int getCost() {
        return 40 + beverage.getCost();
    }
}
