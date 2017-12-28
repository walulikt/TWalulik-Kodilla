package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepository {

    boolean createOrderRepo (User buyer, User seller, LocalDateTime timeOfOrder);
}
