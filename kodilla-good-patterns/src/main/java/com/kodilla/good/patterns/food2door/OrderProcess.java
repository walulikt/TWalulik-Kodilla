package com.kodilla.good.patterns.food2door;

public class OrderProcess {

    public static void main (String [] args) {
        ProductOrdered productOrdered=new ProductOrdered("Jabłka", 2,49, "Extra Food Shop");
        Manufacturer extraFoodShop=new ExtraFoodShop(productOrdered);

        extraFoodShop.process();


    }

}
