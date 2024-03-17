package Application;

import Application.controller.HotelController;
import Application.entity.Guests;
import Application.entity.Hotel;
import Application.entity.Rooms;

import java.sql.SQLException;
import java.util.*;
import java.util.Scanner;

public class MainApplication {
        private static Scanner sc = new Scanner(System.in);
        private static HotelController hotelController = new HotelController();

        public static void main(String[] args) {
            while (true) {
                displayMenu();
                int choice = sc.nextInt();
                sc.nextLine();

                try {
                    switch (choice) {
                        case 1:
                            addHotel();
                            break;
                        case 2:
                            addGuest();
                            break;
                        case 3:
                            addRoom();
                            break;
                        case 4://
                            break;
                        case 0:
                            System.out.println("Exiting the application.");
                            System.exit(0);
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                } //catch (SQLException e) {
                    //System.err.println("Database error: " + e.getMessage());
                //}
            catch (Exception e) {
                    System.err.println("Error: " + e.getMessage());
                }
            }
        }

        private static void displayMenu() {
            System.out.println("1. Add Hotel");
            System.out.println("2. Add Guest");
            System.out.println("3. Add Room");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
        }

        private static void addHotel() throws SQLException {
            System.out.print("Enter hotel name: ");
            String name = sc.nextLine();

            System.out.print("Enter hotel location: ");
            String location = sc.nextLine();

            Hotel hotel = new Hotel(name, location);
            hotelController.addHotel(hotel);
            System.out.println("Hotel added successfully.");
        }

        private static void addGuest() throws SQLException {
            System.out.print("Enter guest name: ");
            String name = sc.nextLine();

            System.out.print("Enter guest email: ");
            String email = sc.nextLine();

            System.out.print("Enter guest phone: ");
            String phone = sc.nextLine();

            Guests guest = new Guests(0, name, email, phone);
            hotelController.addGuest(guest);
            System.out.println("Guest added successfully.");
        }
//
        private static void addRoom() throws SQLException {


            System.out.print("Enter room type: Single OR Double ");
            String type = sc.nextLine();

            System.out.print("Is the room available? (true/false): ");
            boolean isAvailable = sc.nextBoolean();

            System.out.print("Enter hotel ID for the room: ");
            int hotelId = sc.nextInt();

            Rooms room = new Rooms(0, type, isAvailable, hotelId);
            hotelController.addRoom(room);
            System.out.println("Room added successfully.");
        }
}
