package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderSample {

    public Order retriver () {
        User buyer = new User("Jan Kowalski", "GoldenCreditCard");
        User seller = new User ("Adam Iksiński", "MasterOfSale");

        LocalDateTime timeOfOrder = LocalDateTime.of(2017,12,28,20,15);

        return new Order(buyer, seller, timeOfOrder);
    }
}
