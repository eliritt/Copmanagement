package model.payments;

import model.persons.Employee;
import java.time.LocalDate;

public class Payment {

    private final int paymentID;
    private final Employee employee;
    private String paymentReason;
    private final LocalDate paymentDay;
    private int paymentAmount;

    public Payment(int paymentID, Employee employee, String paymentReason, LocalDate paymentDay, int paymentAmount) {
        this.paymentID = paymentID;
        this.employee = employee;
        this.paymentReason = paymentReason;
        this.paymentDay = paymentDay;
        this.paymentAmount = paymentAmount;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getPaymentReason() {
        return paymentReason;
    }

    public void setPaymentReason(String paymentReason) {
        this.paymentReason = paymentReason;
    }

    public LocalDate getPaymentDay() {
        return paymentDay;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
