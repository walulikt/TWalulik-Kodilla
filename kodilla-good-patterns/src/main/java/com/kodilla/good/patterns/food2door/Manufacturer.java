package com.kodilla.good.patterns.food2door;

public class Manufacturer implements OrderManufacturerService {
    private String name;
    private String adress;
    private int nip;
    protected ProductOrdered productOrdered;
    protected OrderInformationService orderInformationService;

    public Manufacturer(final String name,final String adress,final int nip) {
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
        if (productOrdered.getManufacturer().equals(getName())) {
            orderInformationService.orderInformationSentToManufacturer();
            return true;
            }
        return false;
    }
}
