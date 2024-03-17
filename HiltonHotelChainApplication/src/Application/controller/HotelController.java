package Application.controller;

import Application.entity.Guests;
import Application.entity.Hotel;
import Application.entity.Rooms;
import Application.repository.HiltonHotelRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HotelController {
    private HiltonHotelRepository hiltonHotelRepository;

    public HotelController() {
        this.hiltonHotelRepository = new HiltonHotelRepository();
    }

    public void addHotel(Hotel hotel) throws SQLException {
        try (Connection connection = hiltonHotelRepository.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO Hotel(name, location) VALUES (?, ?)"
             )) {
            preparedStatement.setString(1, hotel.getName());
            preparedStatement.setString(2, hotel.getLocation());
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void addGuest(Guests guest) throws SQLException {
        try (Connection connection = hiltonHotelRepository.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO Guests(name, email, phone, hotel_id) VALUES (?, ?, ?, ?)"
             )) {
            preparedStatement.setString(1, guest.getName());
            preparedStatement.setString(2, guest.getEmail());
            preparedStatement.setString(3, guest.getPhone());
            preparedStatement.setInt(4, guest.getHotelId());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void addRoom(Rooms room) throws SQLException {
        try (Connection connection = hiltonHotelRepository.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO Rooms(type, is_available, price, hotel_id) VALUES (?, ?, ?, ?)"
             )) {
            preparedStatement.setDouble(1, room.getRoomNumber());
            preparedStatement.setString(2, room.getType());
            preparedStatement.setBoolean(3, room.isAvailable());
            preparedStatement.setInt(4, room.getHotelId());
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
