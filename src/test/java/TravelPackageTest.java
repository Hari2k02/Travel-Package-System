import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TravelPackageTest {

    @Test
    void addDestination() {
        TravelPackage travelPackage = new TravelPackage("Adventure Package", 20);
        Destination destination = new Destination("City A");
        travelPackage.addDestination(destination);
    }

    @Test
    void addPassenger_capacityFull() {
        TravelPackage travelPackage = new TravelPackage("Adventure Package", 1);
        Passenger passenger1 = new Passenger("John Doe", 1, PassengerType.STANDARD, 100.0);
        Passenger passenger2 = new Passenger("Jane Smith", 2, PassengerType.STANDARD, 100.0);
        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);
        assertEquals(1, travelPackage.getPassengers().size());
    }
}
