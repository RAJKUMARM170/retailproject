package com.example.rjany;

import com.example.rjany.model.Bill;

public class AmountDiscount extends Discount {

    @Override
    public double calculateDiscount(Bill bill) {
        return (int)(bill.getTotalAmount() / 100) * 5;
    }
}
