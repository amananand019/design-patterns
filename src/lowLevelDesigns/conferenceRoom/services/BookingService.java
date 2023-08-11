package lowLevelDesigns.conferenceRoom.services;

import lowLevelDesigns.conferenceRoom.models.Booking;
import lowLevelDesigns.conferenceRoom.models.Room;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingService {
    private final Map<Integer, Map<String, Booking>> roomBookings;
    private final Map<String, Booking> bookings;
    private final InfraService infraService;

    public BookingService(InfraService infraService) {
        this.roomBookings = new HashMap<>();
        this.bookings = new HashMap<>();
        this.infraService = infraService;
    }

    public void bookRoom(int startTime, int endTime, String buildingName, int floor, String roomId) {
        Room room = infraService.getRoom(buildingName, floor, roomId);
        Booking newBooking = new Booking(room, startTime, endTime);

        for (int time = startTime; time < endTime; time++) {
            Map<String, Booking> bookingsInstance = roomBookings.getOrDefault(time, new HashMap<>());

            if (bookingsInstance.containsKey(roomId)) {
                for (int i = time - 1; i >= startTime; i--) {
                    Map<String, Booking> bookingsInstance1 = roomBookings.get(time);
                    bookingsInstance.remove(roomId);
                }
                throw new RuntimeException("Slot not available, room already booked");
            }

            bookingsInstance.put(roomId, newBooking);

            if (!roomBookings.containsKey(time)) {
                roomBookings.put(time, bookingsInstance);
            }
        }

        bookings.put(newBooking.getBookingId(), newBooking);
    }

    public void cancelBooking(String bookingId) {
        Booking booking = bookings.get(bookingId);

        for (int time = booking.getStartTime(); time < booking.getEndTime(); time++) {
            Map<String, Booking> bookingsInstance = roomBookings.get(time);
            bookingsInstance.remove(booking.getRoom().getRoomId());
        }

        bookings.remove(bookingId);
    }

    public List<Booking> getAllBookings() {
        return new ArrayList<>(bookings.values());
    }
    
}
