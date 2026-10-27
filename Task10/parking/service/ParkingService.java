package parking.service;

import parking.model.ParkingTicket;

public class ParkingService {
    private String[][] slots;

    public ParkingService(int[] slotsPerFloor) {
        slots = new String[slotsPerFloor.length][];
        for (int f = 0; f < slotsPerFloor.length; f++) {
            slots[f] = new String[slotsPerFloor[f]];
        }
    }

    public ParkingTicket park(String regNo) {
        for (int f = 0; f < slots.length; f++) {
            for (int s = 0; s < slots[f].length; s++) {
                if (slots[f][s] == null) {
                    slots[f][s] = regNo;
                    return new ParkingTicket(regNo, f, s);
                }
            }
        }
        return null;
    }

    public boolean leave(ParkingTicket t, int minutes) {
        if (slots[t.getFloor()][t.getSlot()] == null) {
            return false;
        }
        t.setMinutes(minutes);
        slots[t.getFloor()][t.getSlot()] = null;
        return true;
    }
}
