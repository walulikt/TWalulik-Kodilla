package com.kodilla.good.patterns.food2door;

public class ProductOrdered {

    // w przyszłości można zastąpić HashMap<Product, OrderValue> order;
    private String productName;
    private double productPrice;
    private int productQuantity;
    private String manufacturerName;

    public ProductOrdered(final String productName,final double productPrice, final int productQuantity, final String manufacturerName) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.manufacturerName=manufacturerName;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public String getManufacturer() {
        return manufacturerName;
    }
}
