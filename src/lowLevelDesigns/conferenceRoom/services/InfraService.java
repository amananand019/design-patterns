package lowLevelDesigns.conferenceRoom.services;

import lowLevelDesigns.conferenceRoom.models.Building;
import lowLevelDesigns.conferenceRoom.models.Floor;
import lowLevelDesigns.conferenceRoom.models.Room;

import java.util.HashMap;
import java.util.Map;

public class InfraService {
    private final Map<String, Building> buildingMap;

    public InfraService() {
        this.buildingMap = new HashMap<>();
    }

    public Map<String, Building> getBuildingMap() {
        return buildingMap;
    }

    public Room getRoom(String buildingName, int floor, String roomId) {
        if (buildingMap.containsKey(buildingName)) {
            Building building = buildingMap.get(buildingName);
            if (building.getFloors().get(floor).getConferenceRooms().containsKey(roomId)) {
                return building.getFloors().get(floor).getConferenceRooms().get(roomId);
            } else {
                throw new RuntimeException("Conference room doesn't exist");
            }
        } else {
            throw new RuntimeException("Building doesn't exist");
        }
    }

    public void addBuilding(String buildingName) {
        if (!buildingMap.containsKey(buildingName)) {
            Building newBuilding = new Building(buildingName);
            buildingMap.put(buildingName, newBuilding);
        }
    }

    public void addFloor(String buildingName) {
        if (buildingMap.containsKey(buildingName)) {
            Building building = buildingMap.get(buildingName);
            int floorAlreadyPresent = building.getFloors().size();

            Floor newFloor = new Floor(floorAlreadyPresent + 1, buildingName);
            building.getFloors().add(newFloor);
        }
    }

    public void addConferenceRoom(String buildingName, int floorNumber, String conferenceRoomId) {
        if (buildingMap.containsKey(buildingName)) {
            Building building = buildingMap.get(buildingName);
            Floor floor = building.getFloors().get(floorNumber);
            Room conferenceRoom = new Room(conferenceRoomId, floorNumber, buildingName);

            if (!floor.getConferenceRooms().containsKey(conferenceRoomId)) {
                floor.getConferenceRooms().put(conferenceRoomId, conferenceRoom);
            } else {
                throw new RuntimeException("Conference room already exists");
            }
        }
    }
}
