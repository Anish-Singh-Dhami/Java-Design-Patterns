package org.anish.patterns.creational.abstract_factory.car;

public class PetrolCar implements ICar {
    public static final String PETROL_CAR_DRIVE = "Driving petrol car";

    @Override
    public String drive() {
        return PETROL_CAR_DRIVE;
    }
}
