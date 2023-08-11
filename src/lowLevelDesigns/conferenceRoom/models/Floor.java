package lowLevelDesigns.conferenceRoom.models;

import java.util.HashMap;
import java.util.Map;

public class Floor {
    private Map<String, Room> conferenceRooms;
    private final int floorNumber;
    private final String building;

    public Floor(int floorNumber, String building) {
        conferenceRooms = new HashMap<>();
        this.floorNumber = floorNumber;
        this.building = building;
    }

    public Map<String, Room> getConferenceRooms() {
        return this.conferenceRooms;
    }

    public void setConferenceRooms(Map<String, Room> conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public String getBuilding() {
        return building;
    }
}
