package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop extends Manufacturer{

    public GlutenFreeShop (ProductOrdered productOrdered){
        super("Gluten Free Shop", "Wrocław 03-485, ul.Bliska5", 123123456);
        this.productOrdered=productOrdered;
    }

    public boolean process() {
        if (productOrdered.getManufacturer().equals(getName())) {
            orderInformationService.orderInformationSentToManufacturer();
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
