package org.anish.patterns.creational.abstract_factory.vehicle_abstract_factory;

import org.anish.patterns.creational.abstract_factory.bike.ElectricBike;
import org.anish.patterns.creational.abstract_factory.bike.IBike;
import org.anish.patterns.creational.abstract_factory.car.ElectricCar;
import org.anish.patterns.creational.abstract_factory.car.ICar;

public class ElectricVehicleFactory implements IVehicleFactory{
    @Override
    public ICar createCar() {
        return new ElectricCar();
    }

    @Override
    public IBike createBike() {
        return new ElectricBike();
    }
}
