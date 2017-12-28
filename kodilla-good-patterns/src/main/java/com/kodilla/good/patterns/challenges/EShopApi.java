package com.kodilla.good.patterns.challenges;

public class EShopApi {
    public static void main (String [] args) {

        OrderSample orderSample=new OrderSample();
        Order theOrder = orderSample.retriver();

        ProductOrderService productOrderService = new ProductOrderService(new RandomProductOrderSpecyfikation(), new MailOrderInformation(), new LocalOrderRepository());

        productOrderService.process(theOrder);

    }
}
