package patterns.creational.abstract_factory;

import org.anish.patterns.creational.abstract_factory.bike.ElectricBike;
import org.anish.patterns.creational.abstract_factory.bike.IBike;
import org.anish.patterns.creational.abstract_factory.bike.PetrolBike;
import org.anish.patterns.creational.abstract_factory.car.ElectricCar;
import org.anish.patterns.creational.abstract_factory.car.ICar;
import org.anish.patterns.creational.abstract_factory.car.PetrolCar;
import org.anish.patterns.creational.abstract_factory.vehicle_abstract_factory.ElectricVehicleFactory;
import org.anish.patterns.creational.abstract_factory.vehicle_abstract_factory.IVehicleFactory;
import org.anish.patterns.creational.abstract_factory.vehicle_abstract_factory.PetrolVehicleFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.anish.patterns.creational.abstract_factory.bike.ElectricBike.ELECTRIC_BIKE_RIDE;
import static org.anish.patterns.creational.abstract_factory.bike.PetrolBike.PETROL_BIKE_RIDE;
import static org.anish.patterns.creational.abstract_factory.car.ElectricCar.ELECTRIC_CAR_DRIVE;
import static org.anish.patterns.creational.abstract_factory.car.PetrolCar.PETROL_CAR_DRIVE;

public class AbstractFactoryTest {

    @Test
    void testElectricCarDriveOutput() {
        ICar car = new ElectricCar();
        Assertions.assertEquals(ELECTRIC_CAR_DRIVE, car.drive());
    }

    @Test
    void testPetrolCarDriveOutput() {
        ICar car = new PetrolCar();
        Assertions.assertEquals(PETROL_CAR_DRIVE, car.drive());
    }
    @Test
    void testElectricBikeDriveOutput() {
        IBike bike = new ElectricBike();
        Assertions.assertEquals(ELECTRIC_BIKE_RIDE, bike.ride());
    }

    @Test
    void testPetrolBikeDriveOutput() {
        IBike bike = new PetrolBike();
        Assertions.assertEquals(PETROL_BIKE_RIDE, bike.ride());
    }

    @Test
    void testElectricVehicleFactoryProducesCorrectInstances() {
        IVehicleFactory factory = new ElectricVehicleFactory();
        ICar car = factory.createCar();
        IBike bike = factory.createBike();

        Assertions.assertInstanceOf(ElectricCar.class, car);
        Assertions.assertInstanceOf(ElectricBike.class, bike);
    }
    @Test
    void testPetrolVehicleFactoryProducesCorrectInstances() {
        IVehicleFactory factory = new PetrolVehicleFactory();
        ICar car = factory.createCar();
        IBike bike = factory.createBike();

        Assertions.assertInstanceOf(PetrolCar.class, car);
        Assertions.assertInstanceOf(PetrolBike.class, bike);
    }

}
