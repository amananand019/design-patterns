package lowLevelDesigns.conferenceRoom.models;

import java.util.UUID;

public class Booking {
    private String bookingId;
    private Room room;
    private int startTime;
    private int endTime;

    public Booking(Room room, int startTime, int endTime) {
        this.bookingId = UUID.randomUUID().toString();
        this.room = room;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getBookingId() {
        return bookingId;
    }

    public Room getRoom() {
        return room;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }
}
