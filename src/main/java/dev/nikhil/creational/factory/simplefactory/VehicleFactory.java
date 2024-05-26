package dev.nikhil.creational.factory.simplefactory;

public class VehicleFactory {

    public static Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("truck")) {
            return new Truck();
        } else if (type.equalsIgnoreCase("motorcycle")) {
            return new MotorCycle();
        } else {
            throw new IllegalArgumentException("Invalid vehicle type: " +
                    type);
        }
    }
}
