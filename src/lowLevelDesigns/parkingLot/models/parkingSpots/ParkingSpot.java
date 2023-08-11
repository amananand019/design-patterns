package lowLevelDesigns.parkingLot.models.parkingSpots;

import lowLevelDesigns.parkingLot.models.vehicle.Vehicle;

public abstract class ParkingSpot {
    private int id;
    private boolean isFree;
    private Vehicle vehicle;

    public boolean getIsFree() {
        return isFree;
    }

    public abstract boolean assignVehicle(Vehicle vehicle);

    public boolean removeVehicle() {
        this.vehicle = null;
        return true;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
