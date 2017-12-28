package com.kodilla.good.patterns.challenges;

public class OrderDto {

    private User seller;
    private User buyer;
    private boolean orderComplieted;

    public OrderDto(User seller, User buyer, boolean orderComplieted) {
        this.seller = seller;
        this.buyer = buyer;
        this.orderComplieted = orderComplieted;
    }

    public User getSeller() {
        return seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public boolean isOrderComplieted() {
        return orderComplieted;
    }
}
