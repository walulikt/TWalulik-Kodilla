package com.kodilla.good.patterns.food2door;

public class HealthyShop extends Manufacturer {

    public HealthyShop (ProductOrdered productOrdered, OrderInformationService orderInformationService){
        super("Healthy Shop", "Kraków 04-854, ul.Koło 9,", 54887843);
        this.productOrdered=productOrdered;
        this.orderInformationService=orderInformationService;
    }

    public boolean process() {
        if (super.process()) {
            orderInformationService.orderInformationSentToUser();
            PreparationOfDelivery preparationOfDelivery=new PreparationOfDelivery(productOrdered);
            if (preparationOfDelivery.checkInStock()){
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
