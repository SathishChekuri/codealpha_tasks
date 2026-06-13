import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HotelReservationSystem {

    static HashMap<Integer, Room> rooms = new HashMap<>();
    static ArrayList<String> history = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    static double revenue = 0;

    public static void main(String[] args) {

        initializeRooms();

        while (true) {

            System.out.println("\n===== HOTEL RESERVATION SYSTEM =====");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. View All Rooms");
            System.out.println("5. Booking History");
            System.out.println("6. Total Revenue");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    viewAvailableRooms();
                    break;

                case 2:
                    bookRoom();
                    break;

                case 3:
                    cancelBooking();
                    break;

                case 4:
                    viewAllRooms();
                    break;

                case 5:
                    viewHistory();
                    break;

                case 6:
                    System.out.println("Total Revenue: $" + revenue);
                    break;

                case 7:
                    System.out.println("Thank You!");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    public static void initializeRooms() {

        rooms.put(101, new Room(101, "Single", 1000));
        rooms.put(102, new Room(102, "Single", 1000));

        rooms.put(201, new Room(201, "Double", 2000));
        rooms.put(202, new Room(202, "Double", 2000));

        rooms.put(301, new Room(301, "Deluxe", 3500));
        rooms.put(302, new Room(302, "Deluxe", 3500));
    }

    public static void viewAvailableRooms() {

        System.out.println("\n----- AVAILABLE ROOMS -----");

        for (Room room : rooms.values()) {

            if (!room.isBooked()) {

                System.out.println(
                        "Room: " + room.getRoomNumber()
                        + " | Type: " + room.getType()
                        + " | Price: $" + room.getPrice());
            }
        }
    }

    public static void bookRoom() {

        System.out.print("Enter Room Number: ");
        int roomNo = sc.nextInt();
        sc.nextLine();

        Room room = rooms.get(roomNo);

        if (room == null) {
            System.out.println("Room Not Found!");
            return;
        }

        if (room.isBooked()) {
            System.out.println("Room Already Booked!");
            return;
        }

        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        room.bookRoom(customerName);

        revenue += room.getPrice();

        history.add("Booked Room " + roomNo + " by " + customerName);

        System.out.println("Room Booked Successfully!");
    }

    public static void cancelBooking() {

        System.out.print("Enter Room Number: ");
        int roomNo = sc.nextInt();

        Room room = rooms.get(roomNo);

        if (room == null) {
            System.out.println("Room Not Found!");
            return;
        }

        if (!room.isBooked()) {
            System.out.println("Room is Not Booked!");
            return;
        }

        String customer = room.getCustomerName();

        room.cancelBooking();

        history.add("Cancelled Room " + roomNo + " by " + customer);

        System.out.println("Booking Cancelled Successfully!");
    }

    public static void viewAllRooms() {

        System.out.println("\n----- ALL ROOMS -----");

        for (Room room : rooms.values()) {

            System.out.println(
                    "Room: " + room.getRoomNumber()
                    + " | Type: " + room.getType()
                    + " | Price: $" + room.getPrice()
                    + " | Status: "
                    + (room.isBooked() ? "Booked" : "Available")
                    + (room.isBooked()
                    ? " | Customer: " + room.getCustomerName()
                    : ""));
        }
    }

    public static void viewHistory() {

        if (history.isEmpty()) {
            System.out.println("No Booking History Available!");
            return;
        }

        System.out.println("\n----- BOOKING HISTORY -----");

        for (String h : history) {
            System.out.println(h);
        }
    }
}