package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    int testCounter =0;

    @BeforeClass
    public static void before () {
        System.out.println("Początek testów");
    }
    @AfterClass
    public static void  after () {
        System.out.println("Koniec wszystkich testów");
    }
    @Before
    public void beforeTest () {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure () {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(new Circle("circle",2));
        //Then
        Assert.assertEquals(1,shapeCollector.shapes.size());

    }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle("circle",2));
        //When
        shapeCollector.removeFigure(new Circle("circle",2));
        //Then
        Assert.assertEquals(0,shapeCollector.shapes.size());
    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
       // ArrayList<Shape> shapes =new ArrayList<>()
        Circle circle=new Circle("circle", 2);
        shapeCollector.addFigure(circle);
        //When
        Shape getCircle;
        getCircle=shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(circle, getCircle);
    }
    @Test
    public void testShowFigures () {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle=new Circle("circle", 2);
        Square square=new Square("square", 4);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        //When
        shapeCollector.showFigures();
        //Then
        Assert.assertEquals("["+circle.toString()+", "+square.toString()+"]",shapeCollector.shapes.toString());
    }
}
