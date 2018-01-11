package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictor.AggressivePredictor;

public class IndividualYoungCustomer extends Customer {
    public IndividualYoungCustomer(String name) {
        super(name);
        this.buyPredictor=new AggressivePredictor();
    }
}
