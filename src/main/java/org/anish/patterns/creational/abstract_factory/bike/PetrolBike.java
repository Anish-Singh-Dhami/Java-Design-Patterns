package org.anish.patterns.creational.abstract_factory.bike;

public class PetrolBike implements IBike{
    public static final String PETROL_BIKE_RIDE = "Riding petrol bike";
    @Override
    public String ride() {
        return PETROL_BIKE_RIDE;
    }
}
