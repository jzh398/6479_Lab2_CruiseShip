import java.util.ArrayList;
import java.util.List;

public abstract class Passenger {
    private String name;
    private int passangerNum;
    protected double balance; //encapsulation to hide from other classes, preventing changing the data
    protected List<Activities> signedUpActities;

    //constructors
    public Passenger(String name, int passangerNum, double balance){
        this.name = name;
        this.passangerNum = passangerNum;
        this.signedUpActities = new ArrayList<>();
        this.balance = balance;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassangerNum() {
        return passangerNum;
    }

    public void setPassangerNum(int passangerNum) {
        this.passangerNum = passangerNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Activities> getSignedUpActities() {
        return signedUpActities;
    }

    public void setSignedUpActities(List<Activities> signedUpActities) {
        this.signedUpActities = signedUpActities;
    }

    // Method to deduct balance for activity cost
    public boolean deductBalance(double amount) {
        if (amount <= balance) {
            balance -= amount; // Deduct activity cost from balance
            return true; // Successful deduction
        } else {
            System.out.println("Insufficient balance to participate in the activity.");
            return false; // Unsuccessful deduction
        }
    }

    // Method for participating in an activity
    public boolean participateInActivity(Activities activity) {
        if (this instanceof PremiumPassenger) {
            return activity.signUp(); // Premium
        } else {
            // Standard passengers check balance before signing up
            if (deductBalance(activity.getCost())) {
                return activity.signUp(); // Deduct balance and sign up
            }
            return false; // Unable to participate
        }
    }

    // Method to print passenger details
    public void printDetails() {
        System.out.println();
    }
}

