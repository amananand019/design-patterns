package lowLevelDesigns.parkingLot.models.parkingSpots;

import lowLevelDesigns.parkingLot.models.vehicle.Vehicle;

public class Large extends ParkingSpot {
    @Override
    public boolean assignVehicle(Vehicle vehicle) {
        if (this.getVehicle() != null) {
            this.setVehicle(vehicle);
            return true;
        }
        return false;
    }
}
