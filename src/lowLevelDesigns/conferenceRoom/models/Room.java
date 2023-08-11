package lowLevelDesigns.conferenceRoom.models;

public class Room {
    private final String roomId;
    private final int floor;
    private final String building;

    public Room(String roomId, int floor, String building) {
        this.roomId = roomId;
        this.floor = floor;
        this.building = building;
    }

    public String getRoomId() {
        return roomId;
    }

    public int getFloor() {
        return floor;
    }

    public String getBuilding() {
        return building;
    }
}
