import java.util.ArrayList;
import java.util.List;
enum PassengerType {
    STANDARD, GOLD, PREMIUM
}
public class Passenger {
    private String name;
    private int number;
    private PassengerType type;
    private double balance;
    private List<Activity> activities;

    public Passenger(String name, int number, PassengerType type, double balance) {
        this.name = name;
        this.number = number;
        this.type = type;
        this.balance = balance;
        this.activities = new ArrayList<>();
    }
    //calculating balance upon successful signup based on different passenger types
    public boolean signUpForActivity(Activity activity) {
        if (activity.bookActivity()) {
            activities.add(activity);
            if (type == PassengerType.STANDARD) {
                balance -= activity.getCost();
            } else if (type == PassengerType.GOLD) {
                double discountedCost = activity.getCost() * 0.9;
                balance -= discountedCost;
            }
            return true;
        }
        return false;
    }

    public void printDetails() {
        System.out.println("Passenger: " + name);
        System.out.println("Number: " + number);
        System.out.println("Type: " + type);
        System.out.println("Balance: " + balance);
        System.out.println("Activities signed up for:");
        for (Activity activity : activities) {
            System.out.println("- " + activity.getName() + " at " + activity.getDestination());
            System.out.println("  Price paid: " + activity.getCost());
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
