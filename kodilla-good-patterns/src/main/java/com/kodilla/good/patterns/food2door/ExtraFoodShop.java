package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop extends Manufacturer {


    public ExtraFoodShop (ProductOrdered productOrdered, OrderInformationService orderInformationService){
        super("Extra Food Shop", "Warszawa 05-584, ul.Dobra89,", 513546546);
        this.productOrdered=productOrdered;
        this.orderInformationService=orderInformationService;
    }

    public boolean process() {
        if (super.process()) {
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


