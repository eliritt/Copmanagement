package model.payments;

import model.persons.Employee;
import java.time.LocalDate;

public class SpecialPayment extends Payment {

    private String SpecialPaymentReason;
    private int SpecialPaymentAmount;


    public SpecialPayment(int paymentID, Employee employee, String paymentReason, LocalDate paymentDay,
                          int paymentAmount, String SpecialPaymentReason, int SpecialPaymentAmount) {
        super(paymentID, employee, paymentReason, paymentDay, paymentAmount);
        this.SpecialPaymentReason = SpecialPaymentReason;
        this.SpecialPaymentAmount = SpecialPaymentAmount;
    }

    public String getSpecialPaymentReason() {
        return SpecialPaymentReason;
    }

    public int getSpecialPaymentAmount() {
        return SpecialPaymentAmount;
    }

    public void setSpecialPaymentAmount(int specialPaymentAmount) {
        SpecialPaymentAmount = specialPaymentAmount;
    }

    public void setSpecialPaymentReason(String specialPaymentReason) {
        SpecialPaymentReason = specialPaymentReason;
    }
}
