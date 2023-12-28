import java.util.ArrayList;
import java.util.List;

public class TravelPackageSystem {
    private List<TravelPackage> travelPackages;

    public TravelPackageSystem() {
        this.travelPackages = new ArrayList<>();
    }

    public void addTravelPackage(TravelPackage travelPackage) {
        travelPackages.add(travelPackage);
    }

    public void printItinerary() {
        System.out.println("All Travel Packages Itinerary:");
        for (TravelPackage travelPackage : travelPackages) {
            travelPackage.printItinerary();
        }
    }

    public void printPassengerList() {
        System.out.println("All Travel Packages Passenger List:");
        for (TravelPackage travelPackage : travelPackages) {
            travelPackage.printPassengerList();
        }
    }
}
