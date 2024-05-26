package dev.nikhil.creational.factory.abstarct;

// Concrete factory for sports cars
public class SportsCarFactory implements CarFactory {
    public Engine createEngine() {
        return new SportsEngine();
    }
    public Wheels createWheels() {
        return new SportsWheels();
    }
}
