package org.anish.patterns.creational.abstract_factory.bike;

public class ElectricBike implements IBike{
    public static final String ELECTRIC_BIKE_RIDE = "Riding electric bike";
    @Override
    public String ride() {
        return ELECTRIC_BIKE_RIDE;
    }
}
