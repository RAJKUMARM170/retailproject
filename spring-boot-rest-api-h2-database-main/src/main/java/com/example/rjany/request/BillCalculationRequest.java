package com.example.rjany.request;

import com.example.rjany.model.Bill;
import com.example.rjany.model.User;

public class BillCalculationRequest
{
    private User user;
    private Bill bill;

    public BillCalculationRequest(User user, Bill bill) {
        this.user = user;
        this.bill = bill;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
