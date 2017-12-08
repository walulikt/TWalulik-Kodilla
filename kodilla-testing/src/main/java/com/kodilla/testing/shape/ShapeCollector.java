package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapes =new ArrayList<>();

    public int addFigure(Shape shape){

        shapes.add(shape);
        return shapes.size();
    }

    public int removeFigure (Shape shape) {
        shapes.remove(shape);
        return shapes.size();
    }

    public Shape getFigure(int n) {
        Shape shape = shapes.get(n);
        return shape;
    }

    public String showFigures() {
        return shapes.toString();
    }
}

