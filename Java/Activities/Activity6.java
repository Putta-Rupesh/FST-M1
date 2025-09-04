package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>(); // creating array with in the given range(<>)
    }

	public void onboard(String passengerName) {
        if(passengers.size() <= maxPassengers) {
            this.passengers.add(passengerName); // adding elements into array
        } else {
            System.out.println("Plane is full");
        }
    }

    public Date takeOff() {
        this.lastTimeTookOf = new Date(); // getting date from system
        return lastTimeTookOf;
    }

    public void land() {
        this.lastTimeLanded = new Date();
        this.passengers.clear();   // here we are clearing the data in array
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassengers() { // List<string> --> [] output
        return passengers;    // Since passengers is array we have to declare List<String>
    }
}

public class Activity6 {

    public static void main(String[] args) throws InterruptedException {
        //There is a plane with max 10 passengers
        Plane plane = new Plane(10);
        //Add passengers on the list
        plane.onboard("John");
        plane.onboard("Steve");
        plane.onboard("Anna");
        //Plane takes off
        System.out.println("Plane took off at: " + plane.takeOff());
        //Print list of people on board
        System.out.println("People on the plane: " + plane.getPassengers());
        //Flying.....
        Thread.sleep(5000);
        //Plane has landed
        plane.land();
        //Plane lands
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassengers());
    }
}