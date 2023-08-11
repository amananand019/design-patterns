package lowLevelDesigns.parkingLot.models.vehicle;

import lowLevelDesigns.parkingLot.models.ParkingTicket;

public abstract class Vehicle {
    private int licenseNo;

    public abstract void assignTicket(ParkingTicket ticket);
}
