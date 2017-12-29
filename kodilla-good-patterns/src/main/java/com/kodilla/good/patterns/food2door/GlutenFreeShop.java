package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop extends Manufacturer{

    public GlutenFreeShop (ProductOrdered productOrdered, OrderInformationService orderInformationService){
        super("Gluten Free Shop", "Wrocław 03-485, ul.Bliska5", 123123456);
        this.productOrdered=productOrdered;
        this.orderInformationService=orderInformationService;
    }

    public boolean process() {
        if (super.process()) {
            orderInformationService.orderInformationSentToUser();
            PreparationOfDelivery preparationOfDelivery=new PreparationOfDelivery(productOrdered);
            if (preparationOfDelivery.checkInStock()){
                preparationOfDelivery.sentGift();
                orderInformationService.orderConfirmationSentToUser();
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

}
