package org.anish.patterns.creational.abstract_factory.car;

public class ElectricCar implements ICar{
    public static final String ELECTRIC_CAR_DRIVE = "Driving electric car";
    @Override
    public String drive() {
        return ELECTRIC_CAR_DRIVE;
    }
}
