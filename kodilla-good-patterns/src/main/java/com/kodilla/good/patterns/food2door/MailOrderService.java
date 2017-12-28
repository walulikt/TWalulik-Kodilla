package com.kodilla.good.patterns.food2door;

public class MailOrderService implements OrderInformationService {

    @Override
    public boolean orderInformationSentToManufacturer() {
        return false;
    }

    @Override
    public boolean orderInformationSentToUser() {
        return false;
    }

    @Override
    public boolean orderConfirmationSentToUser() {
        return false;
    }
}
