package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop extends Manufacturer {


    public ExtraFoodShop (ProductOrdered productOrdered){
        super("Extra Food Shop", "Warszawa 05-584, ul.Dobra89,", 513546546);
        this.productOrdered=productOrdered;
    }

    public boolean process() {
        if (productOrdered.getManufacturer().equals(getName())) {
            orderInformationService.orderInformationSentToManufacturer();
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
