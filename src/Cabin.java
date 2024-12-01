public class Cabin extends CruiseShip{
    private String cabinName;
    private Passenger passenger;
    private String type;
    private boolean isOccupied;
    private boolean isPremium;

    //constructor
    public Cabin(String name, int capacity, String cabinName, Passenger occupant, String type) {
        super(name, capacity);
        this.cabinName = cabinName;
        this.passenger = null;
        this.type = type;
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
        if(isOccupied = true){
            System.out.println("Cabin is already occupied, please book another cabin!");
            return false;
        }
        if(type.equals("premium") && !(passenger instanceof PremiumPassenger)) {
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
        if(isOccupied){
            System.out.println("Passenger Name: " + passenger.getName());
            System.out.println("Passenger Number:" + passenger.getPassangerNum());
        }else{
            System.out.println("Unoccupied");
        }

    }

}
