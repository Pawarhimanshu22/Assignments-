package Singleton_Design_Pattern;

public class Example {
    public static void main(String[] args) {

        Engineer instanceOfEngineer = Engineer.getInstanceOfEngineer();
        System.out.println(instanceOfEngineer.hashCode());


        Engineer instanceOfEngineer1 = Engineer.getInstanceOfEngineer();
        System.out.println(instanceOfEngineer1.hashCode());
        System.out.println(instanceOfEngineer1.equals(instanceOfEngineer1));

        Computer instanceOfComputer = Computer.getInstanceOfComputer();
        System.out.println(instanceOfEngineer.hashCode());

        Computer instanceOfComputer1 = Computer.getInstanceOfComputer();
        System.out.println(instanceOfComputer1.hashCode());
        System.out.println(instanceOfComputer1.equals(instanceOfComputer));

    }
}
