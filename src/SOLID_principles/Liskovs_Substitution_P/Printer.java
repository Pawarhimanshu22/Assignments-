package SOLID_principles.Liskovs_Substitution_P;

public class Printer {
    public void printArea(IShap shape)
    {
        System.out.println("Area: " + shape.getArea());
    }
}
