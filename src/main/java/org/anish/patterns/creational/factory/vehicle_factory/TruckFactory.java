package org.anish.patterns.creational.factory.vehicle_factory;

import org.anish.patterns.creational.factory.vehicle.Truck;
import org.anish.patterns.creational.factory.vehicle.IVehicle;

public class TruckFactory implements VehicleFactory{
    @Override
    public IVehicle createVehicle() {
        return new Truck();
    }
}
