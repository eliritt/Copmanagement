package model.Payment;

import java.time.LocalDate;

public class Payment {

    private double amount;
    private LocalDate nextIncrease;

    public Payment(double amount, LocalDate nextIncrease) {
        this.amount = amount;
        this.nextIncrease = nextIncrease;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getNextIncrease() {
        return nextIncrease;
    }

    public void setNextIncrease(LocalDate nextIncrease) {
        this.nextIncrease = nextIncrease;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                ", nextIncrease=" + nextIncrease +
                '}';
    }
}
