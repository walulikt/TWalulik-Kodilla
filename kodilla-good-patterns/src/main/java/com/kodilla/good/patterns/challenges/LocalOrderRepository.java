package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class LocalOrderRepository implements OrderRepository {

    @Override
    public boolean createOrderRepo (User buyer, User seller, LocalDateTime timeOfOrder){
        boolean sentToRepo=false;
        if (timeOfOrder.compareTo(LocalDateTime.now())<0)
            sentToRepo=true;
        return sentToRepo;

    }
}
