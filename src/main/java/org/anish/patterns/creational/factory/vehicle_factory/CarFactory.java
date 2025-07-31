package org.anish.patterns.creational.factory.vehicle_factory;

import org.anish.patterns.creational.factory.vehicle.Car;
import org.anish.patterns.creational.factory.vehicle.IVehicle;

public class CarFactory implements VehicleFactory{
    @Override
    public IVehicle createVehicle() {
        return new Car();
    }
}
