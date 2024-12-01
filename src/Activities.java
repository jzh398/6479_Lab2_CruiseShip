//done
public abstract class Activities {
    private String name;
    private String description;
    protected double cost;
    private int capacity;
    private int enrolledCount = 0;
    private Destination destination;

    public Activities(String name, String description, double cost, int capacity, Destination destination) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.destination = destination;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEnrolledCount(){
        return enrolledCount;
    }

    public void setEnrolledCount(int enrolledCount){
        this.enrolledCount = enrolledCount;
    }

    public Destination getDestination(){
        return destination;
    }

    public void setDestination(Destination destination){
        this.destination = destination;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Method to check if there is space for more participants
    public boolean hasSpace() {
        return enrolledCount < capacity; // Check for available space
    }

    // Method to sign up a participant for the activity
    public boolean signUp() {
        if (hasSpace()) {
            enrolledCount++; // Increment enrolled count
            return true; // Successfully signed up
        } else {
            System.out.println("No space available for this activity.");
            return false; // No space available
        }
    }

    // Abstract method to print details of the activity
    public abstract void printDetails();

}
