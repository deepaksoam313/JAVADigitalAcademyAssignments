package Application.entity;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private int hotelId;
    private String name;
    private String location;
    private List<Rooms> rooms;
    private List<Guests> guests;
    private List<Reservation> reservations;

    //Constructor
    public Hotel(String name, String location) {
        this.name = name;
        this.location = location;
        this.rooms = new ArrayList<>();
        this.guests = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    //Getters and Setters
    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Rooms> getRooms() {
        return rooms;
    }

    public void setRooms(List<Rooms> rooms) {
        this.rooms = rooms;
    }

    public List<Guests> getGuests() {
        return guests;
    }

    public void setGuests(List<Guests> guests) {
        this.guests = guests;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
