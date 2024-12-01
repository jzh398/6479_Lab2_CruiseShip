public class PremiumPassenger extends Passenger{
    public PremiumPassenger(String name, int passengerNum, double balance){
        super(name, passengerNum, balance);
    }

    @Override
    public boolean participateInActivity(Activities activity) {
        System.out.printf("Premium passenger " + getName() + " is participating in activity: " + activity.getName());
        return activity.signUp(); // Directly sign up for the activity
    }



}
