package org.anish.patterns.creational.factory;

public class CarFactory extends VehicleFactory{
    @Override
    public IVehicle createVehicle() {
        return new Car();
    }
}
