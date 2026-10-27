package parking.app;

import parking.model.ParkingTicket;
import parking.service.ParkingService;

class BadTicket {
    public int minutes;
}

public class Main {
    public static void main(String[] args) {
        int[] floors_service = {2, 1};
        ParkingService service = new ParkingService(floors_service);
        ParkingTicket t = service.park("TN01AB1111");
        System.out.println(t.getTicketNo() + " " + t.getFloor() + " "
                + t.getSlot());

        t.setMinutes(-5);

        System.out.println(service.leave(t, 130));
        System.out.println(t.getMinutes());

        Integer a = 127;
        Integer b = 127;
        Integer c = 1000;
        Integer d = 1000;
        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(c.equals(d));

        BadTicket bad = new BadTicket();
        bad.minutes = -999;
        System.out.println(bad.minutes);
    }
}
