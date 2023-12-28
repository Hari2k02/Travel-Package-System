public class Nymble {
    public static void main(String[] args) {

        TravelPackageSystem travelPackageSystem = new TravelPackageSystem();


        Activity cityTour = new Activity("City Tour", "Explore the city", 50.0, 10, "City A");
        Activity hiking = new Activity("Hiking Adventure", "Experience nature", 80.0, 15, "Mountain B");

        Destination cityDestination = new Destination("City A");
        cityDestination.addActivity(cityTour);

        Destination mountainDestination = new Destination("Mountain B");
        mountainDestination.addActivity(hiking);

        Passenger standardPassenger = new Passenger("John Doe", 1, PassengerType.STANDARD, 100.0);
        Passenger goldPassenger = new Passenger("Jane Smith", 2, PassengerType.GOLD, 150.0);


        TravelPackage travelPackage = new TravelPackage("Adventure Package", 20);
        travelPackage.addDestination(cityDestination);
        travelPackage.addDestination(mountainDestination);
        travelPackage.addPassenger(standardPassenger);
        travelPackage.addPassenger(goldPassenger);

        travelPackageSystem.addTravelPackage(travelPackage);

        travelPackageSystem.printItinerary();
        travelPackageSystem.printPassengerList();

        standardPassenger.signUpForActivity(cityTour);
        goldPassenger.signUpForActivity(hiking);

        standardPassenger.printDetails();
        goldPassenger.printDetails();
    }
}
