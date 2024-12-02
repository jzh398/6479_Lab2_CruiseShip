import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CruiseShip {
    private String name;
    private int capacity;
    private ArrayList<Passenger> passengers;
    private ArrayList<Destination> itinerary;
    private ArrayList<Cabin> cabinList;

    //constructor
    public CruiseShip(String name, int capacity){
        passengers = new ArrayList<>();
        itinerary = new ArrayList<>();
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public ArrayList<Destination> getItinerary() {
        return itinerary;
    }

    public void setItinerary(ArrayList<Destination> itinerary) {
        this.itinerary = itinerary;
    }

    public ArrayList<Cabin> getCabinList() {
        return cabinList;
    }


    public void setCabinList(ArrayList<Cabin> cabinList) {
        this.cabinList = cabinList;
    }

    //methods here!

    public boolean addPassenger(Passenger passenger){
        // Add a validation check here.
        // Need to know if the cruise ship is already full or not
        // If the cruise ship is already full of passengers
        if (passengers.size() == capacity) {
            System.out.println("This cruise ship is already full, cannot add more passengers!");
            return false;
        }
        
        // Otherwise add the passenger. 
        passengers.add(passenger);
        return true;
    }

    public void addDestination(Destination destination){
        itinerary.add(destination);
    }

    public void addCabin(Cabin cabin){
        cabinList.add(cabin);
    }


    public void printItinerary(){
        //print itinerary here
        System.out.println("The itinerary of this cruise ship is: ");
        itinerary.forEach((destination) -> {
            System.out.println("The name of this destination is: " + destination.getDestination());
            ArrayList<Activities> activities = destination.getActivitiesList();
            System.out.println("There are " + activities.size() + " activities at " + destination.getDestination());
            activities.forEach(Activities::printDetails);
        });
    }

    public void printCabin(){
        //print cabin here
        System.out.println("There are " + cabinList.size() + " cabins in this cruise ship. ");
    }

    public void printPassengers() {
        System.out.println("The name of this cruise ship is " + name);
        System.out.println("The capacity of this cruise ship is " + capacity);
        System.out.println("There are " + passengers.size() + " on this cruise ship now");
        System.out.println("The passenger list is shown below: ");
        System.out.println("Passenger Name" + "Passenger Number");
        passengers.forEach((passenger) -> {
            System.out.println(passenger.getName());
            System.out.print(" ");
            System.out.print(passenger.getPassengerNum());
        });
    }
}
