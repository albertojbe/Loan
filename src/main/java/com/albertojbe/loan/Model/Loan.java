package com.albertojbe.loan.Model;

public class Loan {
    private Customer customer;

    public Loan(Customer customer) {
        this.customer = customer;
    }

    public boolean isPersonalLoanAvailable() {
        if (customer.isIncomeLowerOrEqualThat(3000.0)) {
            return true;
        }
        return customer.isIncomeBetweenThat(3000.0, 5000.0)
                && customer.isAgeLowerThat(30)
                && customer.IsCustomerLivesAt("SP");
    }
    public boolean isGuaranteedLoanAvailable() {
        if (customer.isIncomeLowerOrEqualThat(3000.0)) {
            return true;
        }
        return customer.isIncomeBetweenThat(3000.0, 5000.0)
                && customer.isAgeLowerThat(30)
                && customer.IsCustomerLivesAt("SP");
    }
    public boolean isConsignmentLoanAvailable() {
        return customer.isIncomeUpperOrEqualThat(5000.0);
    }
}
