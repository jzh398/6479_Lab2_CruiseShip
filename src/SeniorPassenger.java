public class SeniorPassenger extends Passenger {
    private static final double discount = 0.10; // Encapsulation: Hiding access from other classes

    // Constructor
    public SeniorPassenger(String name, int passengerNum, double balance) {
        super(name, passengerNum, balance); // Call the superclass constructor
    }

    // Override participateInActivity to apply the discount
    @Override
    public boolean participateInActivity(Activities activity) {
        double discountedCost = activity.getCost() * (1 - discount); // Apply 10% discount
        System.out.println("Senior passenger " + getName() + " is participating in activity " + activity.getName());

        // Deduct the discounted cost from balance
        if (deductBalance(discountedCost)) {
            signedUpActities.add(activity);
            return activity.signUp(); // Sign up for the activity
        }
        return false; // Unable to participate due to insufficient balance
    }

}
