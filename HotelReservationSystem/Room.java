public class Room {

    private int roomNumber;
    private String type;
    private double price;
    private boolean booked;
    private String customerName;

    public Room(int roomNumber, String type, double price) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.booked = false;
        this.customerName = "";
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBooked() {
        return booked;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void bookRoom(String customerName) {
        booked = true;
        this.customerName = customerName;
    }

    public void cancelBooking() {
        booked = false;
        customerName = "";
    }
}