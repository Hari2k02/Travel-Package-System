import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DestinationTest {

    @Test
    void addActivity() {
        Destination destination = new Destination("City A");
        Activity activity = new Activity("City Tour", "Explore the city", 50.0, 10, "City A");
        destination.addActivity(activity);
    }

}
