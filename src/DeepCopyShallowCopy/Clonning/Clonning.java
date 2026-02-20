package DeepCopyShallowCopy.Clonning;

public class Clonning {
    public static void main(String[] args) {

        //Shallow Copy
        // Deep Copy
        //Clonning
        Human human = new Human();
        human.age = 21;
        human.name = "Himanshu Pawar";

//      Human human1 = new Human();
        Human human1 = human;
        human1.name = "Himesh";

        System.out.println(human);
        System.out.println(human1);

        //Deep Copy
        Human human2 = new Human();
        human2.name = human.name;
        human2.age = human.age;

        human.name = "Himanshu";

        System.out.println(human);
        System.out.println(human2);
    }
}
class Human
{
    int age;
    String name;

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
