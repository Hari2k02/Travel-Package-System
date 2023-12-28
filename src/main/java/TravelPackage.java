import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
    private String name;
    private int capacity;
    private List<Destination> itinerary;
    private List<Passenger> passengers;

    public TravelPackage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.itinerary = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public void addDestination(Destination destination) {
        itinerary.add(destination);
    }

    public void addPassenger(Passenger passenger) {
        if (passengers.size() < capacity) {
            passengers.add(passenger);
        } else {
            System.out.println("Travel package is full. Cannot add more passengers.");
        }
    }

    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        System.out.println("Itinerary:");
        for (Destination destination : itinerary) {
            destination.printActivities();
        }
    }

    public void printPassengerList() {
        System.out.println("Travel Package: " + name);
        System.out.println("Passenger List:");
        System.out.println("Capacity: " + capacity);
        System.out.println("Passengers enrolled: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println("- " + passenger.getName() + " (#" + passenger.getNumber() + ")");
        }
    }
}
