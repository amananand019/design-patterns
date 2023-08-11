package lowLevelDesigns.parkingLot.service;

import lowLevelDesigns.parkingLot.models.Entrance;
import lowLevelDesigns.parkingLot.models.Exit;
import lowLevelDesigns.parkingLot.models.ParkingRate;
import lowLevelDesigns.parkingLot.models.ParkingTicket;

import java.util.HashMap;

public class ParkingLot {
    private int id;
    private String name;
    private String address;
    private ParkingRate parkingRate;

    private HashMap<Integer, Entrance> entrance;
    private HashMap<Integer, Exit> exit;

    // Create a hashmap that identifies all currently generated tickets using their ticket number
    private HashMap<String, ParkingTicket> tickets;

    // The ParkingLot is a singleton class that ensures it will have only one active instance at a time
    // Both the Entrance and Exit classes use this class to create and close parking tickets
    private static ParkingLot parkingLot = null;

    // Created a private constructor to add a restriction (due to Singleton)
    private ParkingLot() {
        // Call the name, address, parking_rate elements of the customer in the parking lot from the database
        // Create initial entrance and exit hashmaps respectively
    }

    // Created a static method to access the singleton instance of ParkingLot
    public static ParkingLot getInstance() {
        if (parkingLot == null) {
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }

    public boolean addEntrance(Entrance entrance) {
        if (!this.entrance.containsKey(entrance.getId())) {
            this.entrance.put(entrance.getId(), entrance);
            return true;
        }

        return false;
    }

    public boolean addExit(Exit exit) {
        if (!this.exit.containsKey(exit.getId())) {
            this.exit.put(exit.getId(), exit);
            return true;
        }
        return false;
    }

    // This function allows parking tickets to be available at multiple entrances
    /*
    public ParkingTicket getParkingTicket(Vehicle vehicle) {
    }

    public boolean isFull(ParkingSpot type) {
    }
    */
}
