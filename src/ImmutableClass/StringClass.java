package ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class StringClass {

    public static void main(String[] args) {
        String s1 = "Hello";
        s1.concat("World");

        List<String> color = new ArrayList<>();
        color.add("Balck");
        color.add("Green");
//       color.add("White");
        color.add("White");

        Shape shape = new Shape(1, "Rectangle", color);
        System.out.println(shape);

        color.add("Pink");
        System.out.println(shape);

        Shape shape1 = shape.modifyList("Purple");
        System.out.println(shape1);
    }
}
final class Shape
{
    private final long id;
    private final String name;
    private final List<String> color;

    public Shape(long id, String name, List<String> color) {
        this.id = id;
        this.name = name;
        this.color = new ArrayList<>(color);// Defensive copy
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getColor() {
        return new ArrayList<>(color);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color=" + color +
                '}';
    }

    public Shape modifyList(String color)
    {
        ArrayList<String> newColorList = new ArrayList<>(this.color);
        newColorList.add(color);
        return new Shape(this.id, this.name, newColorList);
    }
}

