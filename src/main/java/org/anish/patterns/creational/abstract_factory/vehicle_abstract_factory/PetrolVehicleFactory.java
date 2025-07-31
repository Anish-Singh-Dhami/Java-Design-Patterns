package org.anish.patterns.creational.abstract_factory.vehicle_abstract_factory;

import org.anish.patterns.creational.abstract_factory.bike.IBike;
import org.anish.patterns.creational.abstract_factory.bike.PetrolBike;
import org.anish.patterns.creational.abstract_factory.car.ICar;
import org.anish.patterns.creational.abstract_factory.car.PetrolCar;

public class PetrolVehicleFactory implements IVehicleFactory{
    @Override
    public ICar createCar() {
        return new PetrolCar();
    }

    @Override
    public IBike createBike() {
        return new PetrolBike();
    }
}
