package SOLID_principles.Liskovs_Substitution_P;

public class Square implements IShap {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
