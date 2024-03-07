package SoftwareDesign;

public class Main {
	 public static void main(String[] args) {
	        // Create travel package
	        TravelPackage travelPackage = new TravelPackage("Summer Vacation", 20);

	        // Create destinations
	        Destination destination1 = new Destination("Beach");
	        Destination destination2 = new Destination("Mountain");

	        // Create activities for destination 1
	        Activity activity1 = new Activity("Snorkeling", "Explore the underwater world", 50.0, 10);
	        destination1.addActivity(activity1);
	        Activity activity2 = new Activity("Surfing", "Ride the waves", 40.0, 15);
	        destination1.addActivity(activity2);

	        // Create activities for destination 2
	        Activity activity3 = new Activity("Hiking", "Explore scenic trails", 30.0, 12);
	        destination2.addActivity(activity3);
	        Activity activity4 = new Activity("Rock Climbing", "Conquer the cliffs", 45.0, 8);
	        destination2.addActivity(activity4);

	        // Add destinations to travel package itinerary
	      //  travelPackage.addDestination(destination1);
	    //    travelPackage.addDestination(destination2);

	        // Print itinerary
	        travelPackage.printItinerary();
	    }

}
