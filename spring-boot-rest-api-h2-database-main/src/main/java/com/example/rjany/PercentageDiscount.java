package com.example.rjany;

import com.example.rjany.model.Bill;

public class PercentageDiscount  extends Discount{
    private double discountPercentage;

    public PercentageDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateDiscount(Bill bill) {
        return bill.getTotalAmount() * discountPercentage / 100;
    }

}
