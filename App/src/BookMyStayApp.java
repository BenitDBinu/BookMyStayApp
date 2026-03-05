/**
 * Book My Stay - Hotel Booking Management System
 *
 * Use Case 2: Basic Room Types & Static Availability
 * This program demonstrates object-oriented modeling using
 * abstraction, inheritance, polymorphism, and encapsulation.
 *
 * @author Student
 * @version 2.1
 */

// Abstract Room class
abstract class Room {

    protected String roomType;
    protected int numberOfBeds;
    protected int roomSize;
    protected double pricePerNight;

    // Constructor
    public Room(String roomType, int numberOfBeds, int roomSize, double pricePerNight) {
        this.roomType = roomType;
        this.numberOfBeds = numberOfBeds;
        this.roomSize = roomSize;
        this.pricePerNight = pricePerNight;
    }

    // Method to display room details
    public void displayRoomDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Room Size: " + roomSize + " sq.ft");
        System.out.println("Price Per Night: $" + pricePerNight);
    }
}


// Single Room class
class SingleRoom extends Room {

    public SingleRoom() {
        super("Single Room", 1, 200, 100.0);
    }
}


// Double Room class
class DoubleRoom extends Room {

    public DoubleRoom() {
        super("Double Room", 2, 350, 180.0);
    }
}


// Suite Room class
class SuiteRoom extends Room {

    public SuiteRoom() {
        super("Suite Room", 3, 600, 350.0);
    }
}


/**
 * Application Entry Point for Use Case 2
 */
public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("       Book My Stay Application       ");
        System.out.println("       Hotel Booking System v2.1      ");
        System.out.println("======================================");

        // Creating room objects (Polymorphism)
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Static availability variables
        int singleRoomAvailability = 10;
        int doubleRoomAvailability = 7;
        int suiteRoomAvailability = 3;

        System.out.println("\n--- Room Details & Availability ---\n");

        singleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + singleRoomAvailability);

        System.out.println("----------------------------------");

        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + doubleRoomAvailability);

        System.out.println("----------------------------------");

        suiteRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + suiteRoomAvailability);

        System.out.println("\nApplication execution completed.");
    }
}