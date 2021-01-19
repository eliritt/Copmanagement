package model.PaymentSalary;

import model.persons.Employee;

import java.time.LocalDate;

public class PaymentSalary {

    private final int paymentID;
    private final Employee employee;
    private String paymentReason;
    private final LocalDate paymentDay;
    private int paymentAmount;

    public PaymentSalary(int paymentID, Employee employee, String paymentReason, LocalDate paymentDay, int paymentAmount) {
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

    @Override
    public String toString() {
        return "PaymentSalary{" +
                "paymentID=" + paymentID +
                ", employee=" + employee +
                ", paymentReason='" + paymentReason + '\'' +
                ", paymentDay=" + paymentDay +
                ", paymentAmount=" + paymentAmount +
                '}';
    }
}
