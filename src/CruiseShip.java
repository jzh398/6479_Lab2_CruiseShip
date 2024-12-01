import java.util.ArrayList;

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
        passengers.add(passenger);
        return true;
    }

    public void addDestination(Destination destination){
        itinerary.add(destination);
    }

    public void addCabin(Cabin cabin){
        cabinList.add(cabin);
    }


    public void printItinerary(ArrayList<Destination> itinerary){
        //print itinerary here
    }

    public void printCabin(ArrayList<Cabin> cabinList){
        //print cabin here
    }

    public int getCurrentPassangerCount(ArrayList<Passenger> passengers){
        int count = 1;
        return count;
        //get the passanger count by reading the length of arraylist
    }


}
