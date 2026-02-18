class Animal {}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barking");
    }
}
class Cat extends Animal {}

public class Test {
    public static void main(String[] args) {

        Animal a = new Dog();   // Upcasting

        Dog dog = new Dog();
        System.out.println(dog instanceof Dog);     // true
        System.out.println(dog instanceof Animal);  // true (parent)
        System.out.println(dog instanceof Object);  // true (top parent)


        if (a instanceof Dog) {      // safety check
            Dog d = (Dog) a;         // Downcasting
            d.bark();
        }
    }
}
