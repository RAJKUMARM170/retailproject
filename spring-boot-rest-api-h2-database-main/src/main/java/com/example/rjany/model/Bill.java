package com.example.rjany.model;

public class Bill {

    private double totalAmount;
    private boolean hasGroceries;

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isHasGroceries() {
        return hasGroceries;
    }

    public void setHasGroceries(boolean hasGroceries) {
        this.hasGroceries = hasGroceries;
    }

    public Bill(double totalAmount, boolean hasGroceries) {
        this.totalAmount = totalAmount;
        this.hasGroceries = hasGroceries;
    }
}
