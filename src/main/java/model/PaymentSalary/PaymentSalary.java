package model.PaymentSalary;

import model.persons.Employee;

import java.time.LocalDate;

public class PaymentSalary {

    private double amount;
    private LocalDate nextIncrease;

    public PaymentSalary(double amount, LocalDate nextIncrease) {
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
}
