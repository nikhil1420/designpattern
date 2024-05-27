package dev.nikhil.structural.decorator;

import dev.nikhil.structural.decorator.addon.Mocha;

public class Client {

    public static void main(String[] args) {
        Beverage beverage = new Expresso();
        beverage.getCost();
        beverage = new Mocha(beverage);
        beverage.getCost();
        System.out.println(beverage.getCost());
    }
}
