package com.kodilla.good.patterns.food2door;

public interface OrderInformationService {

    boolean orderInformationSentToManufacturer();

    default boolean orderInformationSentToUser(){
     return false;
    }

    boolean orderConfirmationSentToUser();
}
