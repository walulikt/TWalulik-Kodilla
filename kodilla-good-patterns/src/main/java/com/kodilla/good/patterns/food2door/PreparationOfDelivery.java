package com.kodilla.good.patterns.food2door;

public class PreparationOfDelivery {

    private ProductOrdered productOrdered;

    public PreparationOfDelivery(ProductOrdered productOrdered) {
        this.productOrdered = productOrdered;
    }

    public boolean checkInStock (){
        return true;
    }

    public boolean sentGift (){
        return productOrdered.getProductPrice()*productOrdered.getProductQuantity()>50;
    }

    public ProductOrdered getProductOrdered() {
        return productOrdered;
    }
}
