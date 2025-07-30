package org.anish.patterns.creational.factory;

public class BikeFactory extends VehicleFactory{

    @Override
    public IVehicle createVehicle() {
        return new Bike();
    }
}
