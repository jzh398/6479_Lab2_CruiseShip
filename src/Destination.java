//done
import java.util.ArrayList;
import java.util.List;

public class Destination {
    private String destination;
    private ArrayList<Activities> activitiesList;

    //constructors
    public Destination(String destination, ArrayList<Activities> activitiesList){
        this.destination = destination;
        this.activitiesList = activitiesList;
    }

    //getters & setters
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public ArrayList<Activities> getActivitiesList() {
        return activitiesList;
    }

    public void setActivitiesList(ArrayList<Activities> activitiesList) {
        this.activitiesList = activitiesList;
    }

    //methods
    public void addActivity(Activities activity){
        activitiesList.add(activity);
    }

    public int countAvailableActivity() {
        int count = 0;
        for (int i = 0; i < activitiesList.size(); i++) {
            Activities activity = activitiesList.get(i);
            if (activity.hasSpace()) {
                count += 1;
            }
        }
        return count;
    }

    public void printActivity(){
        int availableCount = countAvailableActivity();
        if (availableCount == 0) {
            System.out.println("There's no available activities at " + destination);
        }
        else {
            System.out.println("The number of available activities is: " + availableCount);
            System.out.println("The available activities are shown below: ");
            activitiesList.forEach((activity) -> {
                System.out.println("Current capacity is " + activity.getAvailableSpace());
                activity.printDetails();
            });
        }
    }
}
