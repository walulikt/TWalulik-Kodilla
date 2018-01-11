package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    private static final int DRIVING = 1;
    private static final int SHOPPING = 2;
    private static final int PAINTING = 3;

    public static int getDRIVING() {
        return DRIVING;
    }

    public static int getSHOPPING() {
        return SHOPPING;
    }

    public static int getPAINTING() {
        return PAINTING;
    }
    public Task taskGenerator (final int theTaskClass){
        switch (theTaskClass) {
            case DRIVING:
                return new DrivingTask("Driving to the city", "Shoping Centre", "Car");
            case SHOPPING:
                return new ShoppingTask("Food shoping", "Milk", 2);
            case PAINTING:
                return new PaintingTask("Flat renowation", "Blue", "Wall");
            default:
                return null;
        }
    }
}
