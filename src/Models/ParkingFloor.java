package Models;

import java.util.List;

public class ParkingFloor {
    private int floorNumber;
    private List<ParkingSpot> slots;
    private ParkingFloorStatus parkingFloorStatus;

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSpot> getSlots() {
        return slots;
    }

    public void setSlots(List<ParkingSpot> slots) {
        this.slots = slots;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }
}
