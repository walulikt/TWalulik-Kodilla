package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Order{
    private User buyer;
    private User seller;
    private LocalDateTime timeOfOrder;

    public Order(final User buyer,final User seller,final LocalDateTime timeOfOrder) {
        this.buyer = buyer;
        this.seller = seller;
        this.timeOfOrder = timeOfOrder;
    }

    public User getBuyer() {
        return buyer;
    }

    public User getSeller() {
        return seller;
    }

    public LocalDateTime getTimeOfOrder() {
        return timeOfOrder;
    }


}
