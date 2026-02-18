package SOLID_principles.Dependency_Inversion_P;

public class Cube implements I3DShap {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }

}
