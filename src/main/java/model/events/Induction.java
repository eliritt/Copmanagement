package model.events;

import java.time.LocalDate;

public class Induction {

    private final LocalDate startDate;
    private final LocalDate endDate;

    public Induction(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "Induction{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
