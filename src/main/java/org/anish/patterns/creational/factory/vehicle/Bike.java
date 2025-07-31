package org.anish.patterns.creational.factory.vehicle;

public class Bike implements IVehicle {
    public static final String BIKE_STARTED_STRING = "Bike Started!!";
    public static final String BIKE_STOPPED_STRING = "Bike Stopped!!";
    @Override
    public String start() {
        return BIKE_STARTED_STRING;
    }

    @Override
    public String stop() {
        return BIKE_STOPPED_STRING;
    }
}
