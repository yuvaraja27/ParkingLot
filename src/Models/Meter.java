package Models;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Meter extends BaseEntity{
    private LocalTime startTime;
    private LocalTime endTime;
    private int unitsConsumed;
    private int amountPerHour;

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public int getAmountPerHour() {
        return amountPerHour;
    }

    public void setAmountPerHour(int amountPerHour) {
        this.amountPerHour = amountPerHour;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
}
