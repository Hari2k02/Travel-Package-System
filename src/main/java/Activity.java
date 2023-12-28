public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private int bookedCount;
    private String destination;

    public Activity(String name, String description, double cost, int capacity, String destination) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.bookedCount = 0;
        this.destination = destination;
    }

    //activity booking check by capacity

    public boolean bookActivity() {
        if (bookedCount < capacity) {
            bookedCount++;
            return true;
        }
        return false;
    }

    public void printDetails() {
        System.out.println("Activity: " + name);
        System.out.println("Destination: " + destination);
        System.out.println("Description: " + description);
        System.out.println("Cost: " + cost);
        System.out.println("Capacity: " + (capacity - bookedCount) + " spaces available");
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String getDestination() {
        return destination;
    }
}
