package dev.nikhil.creational.factory.abstarct;

// Concrete factory for luxury cars
public class LuxuryCarFactory implements CarFactory {
    public Engine createEngine() {
        return new LuxuryEngine();
    }
    public Wheels createWheels() {
        return new LuxuryWheels();
    }
}

