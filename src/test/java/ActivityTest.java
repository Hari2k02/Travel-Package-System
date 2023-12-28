import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ActivityTest {

    @Test
    void bookActivity_success() {
        Activity activity = new Activity("City Tour", "Explore the city", 50.0, 10, "City A");
        assertTrue(activity.bookActivity());
    }

    @Test
    void bookActivity_capacityFull() {
        Activity activity = new Activity("City Tour", "Explore the city", 50.0, 1, "City A");
        activity.bookActivity();
        assertFalse(activity.bookActivity());
    }

}
