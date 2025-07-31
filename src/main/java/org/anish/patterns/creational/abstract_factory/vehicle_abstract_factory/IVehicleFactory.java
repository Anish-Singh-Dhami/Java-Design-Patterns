package org.anish.patterns.creational.abstract_factory.vehicle_abstract_factory;

import org.anish.patterns.creational.abstract_factory.bike.IBike;
import org.anish.patterns.creational.abstract_factory.car.ICar;

public interface IVehicleFactory {
    public ICar createCar();
    public IBike createBike();
}
