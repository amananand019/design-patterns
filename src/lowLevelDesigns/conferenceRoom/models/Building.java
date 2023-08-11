package lowLevelDesigns.conferenceRoom.models;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private final List<Floor> floors;
    private final String name;

    public Building(String name) {
        this.floors = new ArrayList<>();
        this.name = name;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public String getName() {
        return name;
    }
}
