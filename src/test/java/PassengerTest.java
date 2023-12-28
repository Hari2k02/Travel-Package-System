import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @Test
    void signUpForActivity_success() {
        Passenger passenger = new Passenger("John Doe", 1, PassengerType.STANDARD, 100.0);
        Activity activity = new Activity("City Tour", "Explore the city", 50.0, 10, "City A");
        assertTrue(passenger.signUpForActivity(activity));
    }

    @Test
    void signUpForActivity_insufficientBalance() {
        Passenger passenger = new Passenger("Jane Smith", 2, PassengerType.STANDARD, 30.0);
        Activity activity = new Activity("City Tour", "Explore the city", 50.0, 10, "City A");
        assertFalse(passenger.signUpForActivity(activity));
    }
}
