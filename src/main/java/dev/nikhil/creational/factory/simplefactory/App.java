package dev.nikhil.creational.factory.simplefactory;

public class App {

    public static void main(String[] args) {
        Vehicle carFactory = VehicleFactory.createVehicle("car");
        carFactory.drive();
        System.out.println(carFactory);
    }
}
