package com.example.rjany.controller;

import com.example.rjany.DiscountCalculator;
import com.example.rjany.request.BillCalculationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BillController {

    @Autowired
    private DiscountCalculator discountCalculator;

    @PostMapping("/calculate")
    public ResponseEntity<Double> calculate(@RequestBody BillCalculationRequest request) {
        double finalAmount = discountCalculator.calculateFinalAmount(request.getUser(), request.getBill());
        return ResponseEntity.ok(finalAmount);
    }
}