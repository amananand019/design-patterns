package lowLevelDesigns.parkingLot.models;

import lowLevelDesigns.parkingLot.models.parkingSpots.Compact;
import lowLevelDesigns.parkingLot.models.parkingSpots.Handicapped;
import lowLevelDesigns.parkingLot.models.parkingSpots.Large;
import lowLevelDesigns.parkingLot.models.vehicle.MotorCycle;

import java.util.List;

public class DisplayBoard {
    // Data members
    private int id;
    private List<Handicapped> handicappedSpot;
    private List<Compact> compactSpot;
    private List<Large> largeSpot;
    private List<MotorCycle> motorCycleSpot;

    // Member function
    public void showFreeSlot() {
        // TODO: 12/08/23 : Definition
    }
}