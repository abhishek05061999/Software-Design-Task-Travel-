package SoftwareDesign;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
	 private String name;
	    private int passengerNumber;
	    private double balance;
	    private List<Activity> activities;

	    public Passenger(String name, int passengerNumber, double balance) {
	        this.name = name;
	        this.passengerNumber = passengerNumber;
	        this.balance = balance;
	        this.activities = new ArrayList<>();
	    }

	    public void addActivity(Activity activity) {
	        activities.add(activity);
	    }

	    public void printDetails() {
	        System.out.println("Passenger Name: " + name);
	        System.out.println("Passenger Number: " + passengerNumber);
	        System.out.println("Balance: " + balance);
	        System.out.println("Activities: ");
	        for (Activity activity : activities) {
	            System.out.println(" - " + activity.getName() + " at " + activity.getDestination().getName() + ": Cost - " + activity.getCost());
	        }
	    }

}
