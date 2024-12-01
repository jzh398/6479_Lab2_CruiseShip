//done
import java.util.List;

public class Destination {
    private String destination;
    private List<Activities> activitiesList;

    //constructors
    public Destination(String destination, List<Activities> activitiesList){
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

    public List<Activities> getActivitiesList() {
        return activitiesList;
    }

    public void setActivitiesList(List<Activities> activitiesList) {
        this.activitiesList = activitiesList;
    }

    //methods
    public void addActivity(Activities activity){
        activitiesList.add(activity);
    }

    public void printActivity(){
        System.out.println("Activities avalaible at: " + destination + ":");
        if(activitiesList.isEmpty()){
            System.out.println("No activities avaliable.");
            return;
        }

        for(Activities activity: activitiesList){
            activity.printDetails();
        }
    }
}
