package patterns.creational.factory;

import org.anish.patterns.creational.factory.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.anish.patterns.creational.factory.Bike.BIKE_STARTED_STRING;
import static org.anish.patterns.creational.factory.Bike.BIKE_STOPPED_STRING;
import static org.anish.patterns.creational.factory.Car.CAR_STARTED_STRING;
import static org.anish.patterns.creational.factory.Car.CAR_STOPPED_STRING;
import static org.anish.patterns.creational.factory.Truck.TRUCK_STARTED_STRING;
import static org.anish.patterns.creational.factory.Truck.TRUCK_STOPPED_STRING;

public class VehicleFactoryTest {
    @Test
    void carFactoryCreatesCar() {
        VehicleFactory factory = new CarFactory();
        IVehicle vehicle = factory.createVehicle();
        Assertions.assertInstanceOf(Car.class, vehicle);
    }

    @Test
    void testCarStarted() {
        IVehicle car = new Car();
        Assertions.assertEquals(CAR_STARTED_STRING, car.start());
    }

    @Test
    void testCarStopped() {
        IVehicle car = new Car();
        Assertions.assertEquals(CAR_STOPPED_STRING, car.stop());
    }

    @Test
    void bikeFactoryCreatesBike() {
        VehicleFactory factory = new BikeFactory();
        IVehicle vehicle = factory.createVehicle();
        Assertions.assertInstanceOf(Bike.class, vehicle);
    }

    @Test
    void testBikeStarted() {
        IVehicle bike = new Bike();
        Assertions.assertEquals(BIKE_STARTED_STRING, bike.start());
    }

    @Test
    void testBikeStopped() {
        IVehicle bike = new Bike();
        Assertions.assertEquals(BIKE_STOPPED_STRING, bike.stop());
    }

    @Test
    void truckFactoryCreatesTruck() {
        VehicleFactory factory = new TruckFactory();
        IVehicle vehicle = factory.createVehicle();
        Assertions.assertInstanceOf(Truck.class, vehicle);
    }
    @Test
    void testTruckStarted() {
        IVehicle truck = new Truck();
        Assertions.assertEquals(TRUCK_STARTED_STRING, truck.start());
    }

    @Test
    void testTruckStopped() {
        IVehicle truck = new Truck();
        Assertions.assertEquals(TRUCK_STOPPED_STRING, truck.stop());
    }

}
