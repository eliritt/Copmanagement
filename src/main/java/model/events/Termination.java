package model.events;

import java.time.LocalDate;

public class Termination {

    private final LocalDate date;
    private final String reason;

    public Termination(LocalDate date, String reason) {
        this.date = date;
        this.reason = reason;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getReason() {
        return reason;
    }

    @Override
    public String toString() {
        return "Termination{" +
                "date=" + date +
                ", reason='" + reason + '\'' +
                '}';
    }
}
