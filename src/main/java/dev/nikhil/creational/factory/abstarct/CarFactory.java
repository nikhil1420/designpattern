package dev.nikhil.creational.factory.abstarct;

// Abstract Factory interface
public interface CarFactory {
    public Engine createEngine();
    public Wheels createWheels();
}

