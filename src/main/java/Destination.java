import java.util.ArrayList;
import java.util.List;

public class Destination {
    private String name;
    private List<Activity> activities;

    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public void printActivities() {
        System.out.println("Destination: " + name);
        for (Activity activity : activities) {
            activity.printDetails();
        }
    }
}
