package parking.model;

public class ParkingTicket {
    private static int count = 0;
    private int ticketNo;
    private String regNo;
    private int floor;
    private int slot;
    private int minutes;

    public ParkingTicket(String regNo, int floor, int slot) {
        count++;
        this.ticketNo = count;
        this.regNo = regNo;
        setFloor(floor);
        setSlot(slot);
    }

    public int getTicketNo() {
        return ticketNo;
    }

    public String getRegNo() {
        return regNo;
    }

    public int getFloor() {
        return floor;
    }

    public int getSlot() {
        return slot;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setFloor(int floor) {
        if (floor < 0) {
            System.out.println("Invalid floor");
        } else {
            this.floor = floor;
        }
    }

    public void setSlot(int slot) {
        if (slot < 0) {
            System.out.println("Invalid slot");
        } else {
            this.slot = slot;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes < 0) {
            System.out.println("Minutes cannot be negative");
        } else {
            this.minutes = minutes;
        }
    }
}
