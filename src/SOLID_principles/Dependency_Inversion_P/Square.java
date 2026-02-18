package SOLID_principles.Dependency_Inversion_P;

import SOLID_principles.Liskovs_Substitution_P.IShap;

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
