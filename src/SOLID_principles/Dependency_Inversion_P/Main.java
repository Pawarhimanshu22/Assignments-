package SOLID_principles.Dependency_Inversion_P;

public class Main {
    public static void main(String[] args) {
        I2DShap circle = new Circle(5);
        I2DShap rectangle = new Rectangle(4, 6);
        IPrinter printer = new Printer();
        I3DShap cube = new Cube(3);
        calculateArea(circle);
        printer.printArea(cube);

    }
    private static  void calculateArea(I2DShap shape)
    {
        double area = shape.getArea();
        System.out.println("Area: " + area);
    }

    /**
    private static void calculateArea(Circle circle)
    {
        double area = circle.getArea();
        System.out.println("Area of the circle : " + area);
    }
    private static void calculateArea(Rectangle rectangle)
    {
        double area = rectangle.getArea();
        System.out.println("Area of the circle : " + area);
    }
    **/
    //for the calculation of the area of every new type of shape, we need to modify the Main class, which violates the Open/Closed Principle. To adhere to this principle, we can create an interface called Shape with a method getArea(), and then have both Circle and Rectangle implement this interface. This way, we can calculate the area of any shape without modifying the Main class.
}
