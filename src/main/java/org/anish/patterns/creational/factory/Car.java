package org.anish.patterns.creational.factory;

public class Car implements IVehicle{
    public static final String CAR_STARTED_STRING = "Car Started!!";
    public static final String CAR_STOPPED_STRING = "Car Stopped!!";
    @Override
    public String start() {
        return CAR_STARTED_STRING;
    }

    @Override
    public String stop() {
        return CAR_STOPPED_STRING;
    }
}
