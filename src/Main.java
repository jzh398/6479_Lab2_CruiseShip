import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private CruiseShip cruiseShip = new CruiseShip("Pacific Pearl", 1800);

    public static void main(String[] args) {

    }

    public void fillShipInfo() {
        ArrayList<Passenger> passengers = new ArrayList<>();
        ArrayList<Destination> itinerary = new ArrayList<>();
        ArrayList<Cabin> cabinList = new ArrayList<>();
        ArrayList<Activities> activitiesOne = new ArrayList<>();
        ArrayList<Activities> activitiesTwo = new ArrayList<>();
        ArrayList<Activities> activitiesThree = new ArrayList<>();

        Passenger passengerOne = new PremiumPassenger("Jane Smith", 1000);
        Passenger passengerTwo = new SeniorPassenger("Emily Davis", 1001, 200.0);
        Passenger passengerThree = new StandardPassenger("Alex Johnson", 1002, 100.0);

        passengers.add(passengerOne);
        passengers.add(passengerTwo);
        passengers.add(passengerThree);
        cruiseShip.setPassengers(passengers);

        Destination destinationOne = new Destination("Paris", activitiesOne);
        Destination destinationTwo = new Destination("New York", activitiesTwo);
        Destination destinationThree = new Destination("Barcelona", activitiesThree);

        visitAttraction activityOne = new visitAttraction("Eiffel Tower Visit",
                "Enjoy panoramic views from the Eiffel Tower",
                75.0, 8,
                destinationOne,
                "Eiffel Tower");

        watchTheatre activityTwo = new watchTheatre("Broadway Night",
                "Musical theatre show",
                100.0, 15,
                destinationTwo,
                "Broadway Night",
                new ArrayList<>());
        activityTwo.addActor(new theatreActor("John Smith", "The Phantom"));
        activityTwo.addActor(new theatreActor("Emily Davis", "Christine Daaé"));

        walkingTour activityThree = new walkingTour("City Walking Tour",
                "Historical landmarks tour",
                20.0, 5, destinationThree,
                "Gothic Quarter, La Rambla, Park Güell",
                10.0);

        destinationOne.addActivity(activityOne);
        destinationTwo.addActivity(activityTwo);
        destinationThree.addActivity(activityThree);
    }

    public void userInterface() {

    }

    //    public void createCruiseShipList(int cruiseShipNum) {
//        Scanner newScanner = new Scanner(System.in);
//        for (int i = 0; i < cruiseShipNum; i++) {
//            System.out.println("Please enter the name of this cruiseShip: ");
//            String shipName = newScanner.nextLine();
//            System.out.println("Please enter the capacity of this cruiseShip: ");
//            while (!newScanner.hasNextInt()) {
//                System.out.println("Please enter a whole number to represent the capacity");
//            }
//            int shipCapacity = newScanner.nextInt();
//            CruiseShip cruiseShip = new CruiseShip(shipName, shipCapacity);
//            cruiseShips.add(cruiseShip);
//        }
//    }

//    public void fillCruiseShip(CruiseShip cruiseShip) {
//        System.out.println("Since the capacity you entered is: " + cruiseShip.getCapacity());
//        System.out.println("There are " + cruiseShip.getCapacity() + " cabins in total");
//        System.out.println();
//    }
}