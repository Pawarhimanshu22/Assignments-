package SOLID_principles.Open_Close_P;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Printer printer = new Printer();

        System.out.println("Area of the circle: " + circle.getArea());
        System.out.println("Area of the rectangle: " + rectangle.getArea());

        calculateArea(circle);
        printer.printArea(circle);

        calculateArea(rectangle);
        printer.printArea(rectangle);


    }
    private static  void calculateArea(IShap shape)
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
