package ObjectClassInJava;
class Demo
{
    int a, b;
    public Demo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {

        return (a + b);
    }
}
public class ObjectClass
{
    public static void main(String[] args) {
        Demo demo = new Demo(10, 20);
        System.out.println("The sum is : " + demo.add());
        System.out.println("Hash code of demo object : " + demo.hashCode());
        System.out.println("String representation of demo object : " + demo.toString());
        System.out.println("Class of demo object : " + demo.getClass());

        Demo demo2 = new Demo(10, 20);
        System.out.println("demo and demo2 are equal : " + demo.equals(demo2));
        System.out.println("demo and demo2 are same reference : " + (demo == demo2));
        System.out.println("demo and demo2 have same hash code : " + (demo.hashCode() == demo2.hashCode()));

    }
}
