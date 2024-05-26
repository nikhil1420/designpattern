package dev.nikhil.creational.factory.abstarct;

// Client code that uses the abstract factory to create related objects
public class Car {
    private Engine engine;
    private Wheels wheels;
    public Car(CarFactory factory) {
        engine = factory.createEngine();
        wheels = factory.createWheels();
    }
    public void design() {
        engine.design();
        wheels.design();
    }
}
