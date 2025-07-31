package org.anish.patterns.creational.factory.vehicle;

public class Truck implements IVehicle {
    public static final String TRUCK_STARTED_STRING = "Truck Started!!";
    public static final String TRUCK_STOPPED_STRING = "Truck Stopped!!";
    @Override
    public String start() {
        return TRUCK_STARTED_STRING;
    }

    @Override
    public String stop() {
        return TRUCK_STOPPED_STRING;
    }
}
