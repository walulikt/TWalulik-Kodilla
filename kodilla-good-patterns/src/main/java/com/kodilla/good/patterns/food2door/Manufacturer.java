package com.kodilla.good.patterns.food2door;

public class Manufacturer implements OrderManufacturerService {
    private String name;
    private String adress;
    private int nip;
    ProductOrdered productOrdered;
    OrderInformationService orderInformationService;

    protected Manufacturer(final String name,final String adress,final int nip) {
        this.name = name;
        this.adress = adress;
        this.nip = nip;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getNip() {
        return nip;
    }

    @Override
    public boolean process() {

        return false;
    }
}
