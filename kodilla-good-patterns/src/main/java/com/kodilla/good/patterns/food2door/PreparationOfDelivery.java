package com.kodilla.good.patterns.food2door;

public class PreparationOfDelivery {

    ProductOrdered productOrdered;

    public PreparationOfDelivery(ProductOrdered productOrdered) {
        this.productOrdered = productOrdered;
    }

    public boolean checkInStock (){
        boolean isProductInStock=true;
        return isProductInStock;
    }

    public boolean sentGift (){
        double giftValue=productOrdered.getProductPrice()*productOrdered.getProductQuantity();
        if (giftValue>50){
            return true;
        }else {
            return false;
        }
    }
}
