package org.anish.patterns.creational.factory.vehicle_factory;

import org.anish.patterns.creational.factory.vehicle.Bike;
import org.anish.patterns.creational.factory.vehicle.IVehicle;

public class BikeFactory implements VehicleFactory {

    @Override
    public IVehicle createVehicle() {
        return new Bike();
    }
}
