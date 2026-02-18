package SOLID_principles.Dependency_Inversion_P;

public class Printer implements  IPrinter
{
    public void printArea(IShap shape)
    {
        System.out.println("Area: " + shape);
    }
}
