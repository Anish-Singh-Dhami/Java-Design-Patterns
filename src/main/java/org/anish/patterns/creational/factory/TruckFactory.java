package org.anish.patterns.creational.factory;

public class TruckFactory extends VehicleFactory{
    @Override
    public IVehicle createVehicle() {
        return new Truck();
    }
}
