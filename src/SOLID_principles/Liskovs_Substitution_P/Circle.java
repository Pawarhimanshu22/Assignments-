package SOLID_principles.Liskovs_Substitution_P;

public class Circle implements IShap {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }


    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius)
    {
            this.radius = radius;
    }
}
