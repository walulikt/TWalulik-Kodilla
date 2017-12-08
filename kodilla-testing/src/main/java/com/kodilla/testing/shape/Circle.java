package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String name;
    double r;

   public Circle (String name, double r) {
       this.name=name;
       this.r=r;
    }
    @Override
    public String getShapeName() {
        return name;
    }


    public double getField() {
       double circleField;
       circleField=Math.PI*Math.pow(r,2);
       return circleField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.r, r) != 0) return false;
        return name.equals(circle.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(r);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Name of the Shape='" + name + '\'' +
                ", r=" + r +
                " . Field: " + getField();
    }
}
