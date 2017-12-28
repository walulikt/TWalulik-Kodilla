package com.kodilla.good.patterns.challenges;

public class MailOrderInformation implements OrderInformationService {

    @Override
    public void inform(User buyer, User seller) {
        System.out.print(buyer.toString()+ "kupił złożył zamówienie na produkt od: " + seller.toString());
    }
}
