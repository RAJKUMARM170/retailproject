package com.example.rjany;

import com.example.rjany.model.Bill;
import com.example.rjany.model.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

import static com.example.rjany.UserType.*;

@Service
public class DiscountCalculator {

    public double calculateFinalAmount(User user, Bill bill) {
        double percentageDiscount = 0;

        if (!bill.isHasGroceries()) {
            if (user.getUserType().equals(EMPLOYEE)) {
                percentageDiscount = new PercentageDiscount(30).calculateDiscount(bill);
            } else if (user.getUserType().equals(AFFILIATE)) {
                percentageDiscount = new PercentageDiscount(10).calculateDiscount(bill);
            } else if (user.getUserType().equals(LONG_TERM_CUSTOMER)) {
                if (user.getCustomerSince().isBefore(LocalDate.now().minusYears(2))) {
                    percentageDiscount = new PercentageDiscount(5).calculateDiscount(bill);
                }
            }
        }

        double amountDiscount = new AmountDiscount().calculateDiscount(bill);

        double discount = Math.max(percentageDiscount, amountDiscount);

        return bill.getTotalAmount() - discount;
    }
}
