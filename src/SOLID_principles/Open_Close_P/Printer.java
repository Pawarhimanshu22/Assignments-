package SOLID_principles.Open_Close_P;

public class Printer {
    public void printArea(IShap shape)
    {
        System.out.println("Area: " + shape.getArea());
    }
}
