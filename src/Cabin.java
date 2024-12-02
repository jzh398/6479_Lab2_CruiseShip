public class Cabin extends CruiseShip{
    private String cabinName;
    private Passenger passenger;
    private boolean isOccupied;
    private boolean isPremium;

    //constructor
    public Cabin(String name, int capacity, String cabinName, Passenger occupant, boolean isPremium) {
        super(name, capacity);
        this.cabinName = cabinName;
        this.passenger = occupant;
        this.isPremium = isPremium;
    }

    public Cabin(String name, int capacity, String cabinName, boolean isPremium) {
        super(name, capacity);
        this.cabinName = cabinName;
        this.passenger = null;
        this.isPremium = isPremium;
    }

    //getters & setters
    public String getCabinName() {
        return cabinName;
    }

    public void setCabinName(String cabinName) {
        this.cabinName = cabinName;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }


    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    //methods (**)

    public boolean addPassenger(Passenger passenger){

        if(isOccupied){
            System.out.println("Cabin is already occupied, please book another cabin!");
            return false;
        }
        if(isPremium && !(passenger instanceof PremiumPassenger)) {
            System.out.println("Only premium passengers can have access to this cabin! Please choose a standard cabin.");
            return false;
        }

        this.passenger = passenger;
        return true;
    }

    public void removePassenger(){
        this.passenger = null;
    }

    public boolean isOccupied(){
        return isOccupied;
    }

    public void bookCabin(){
        isOccupied = true;
    }

    public void releaseCabin(){
        isOccupied = false;
    }

    public void printDetails(){
        System.out.println("Cabin " + cabinName + ":");
        if (isOccupied) {
            System.out.println("Passenger Name: " + passenger.getName());
            System.out.println("Passenger Number:" + passenger.getPassengerNum());
        } else {
            System.out.println("Unoccupied");
        }
        System.out.println("---------------------------------------------");
    }
}
