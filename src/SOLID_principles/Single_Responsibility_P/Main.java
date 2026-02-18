package SOLID_principles.Single_Responsibility_P;
//3 Responsibilities : 1. Circle class is responsible for storing the radius of the circle and providing access to it.
// 2. Main class is responsible for creating a Circle object, printing its details, and calculating its area.
// 3. The calculateArea method is responsible for calculating the area of the circle based on its radius.
public class Main {
    public static void main(String[] args)
    {
        Circle circle = new Circle(5.0);
        calculateArea(circle);
        Printer printer = new Printer();
        printer.printCircleDetails(circle);
    }

    private static void calculateArea(Circle circle)
    {
//      double area = Math.PI * circle.getRadius() * circle.getRadius();
        double area = circle.getArea();
        System.out.println("Area of the circle : " + area);
    }
    /**
    private static void printCircleDetails(Circle circle)
    {
        System.out.println("Radius of the circle : " + circle.getRadius());
    }
    **/
}
