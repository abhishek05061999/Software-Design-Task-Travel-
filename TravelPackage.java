package SoftwareDesign;
import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
	 private String name;
	    private int passengerCapacity;
	    private List<Destination> itinerary;
	    private List<Passenger> passengers;

	    public TravelPackage(String name, int passengerCapacity) {
	        this.name = name;
	        this.passengerCapacity = passengerCapacity;
	        this.itinerary = new ArrayList<>();
	        this.passengers = new ArrayList<>();
	    }

	    public void printItinerary() {
	        System.out.println("Travel Package: " + name);
	        for (Destination destination : itinerary) {
	            destination.printActivities();
	        }
	    }

	    public void printPassengerList() {
	        System.out.println("Passenger List for Travel Package: " + name);
	        System.out.println("Passenger Capacity: " + passengerCapacity);
	        System.out.println("Number of Passengers Enrolled: " + passengers.size());
	        for (Passenger passenger : passengers) {
	            passenger.printDetails();
	        }
	    }

	    public void addPassenger(Passenger passenger) {
	        if (passengers.size() < passengerCapacity) {
	            passengers.add(passenger);
	        } else {
	            System.out.println("Cannot add passenger. Package is full.");
	        }
	    }

}
