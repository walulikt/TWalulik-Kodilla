package com.kodilla.testing.shape;

public class Square implements Shape {
    private String name;
    double a;

    public Square (String name, double a) {
        this.name=name;
        this.a=a;
    }

    @Override
    public String getShapeName() {
        return name;
    }


    public double getField() {
        double squareField;
        squareField=Math.pow(a,2.0);

        return squareField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.a, a) != 0) return false;
        return name.equals(square.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Name of the Shape='" + name + '\'' +
                ", a=" + a +
                " . Field: " + getField();
    }
}
