package Singleton_Design_Pattern.Way_to_Break;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {

        Engineer instanceOfEngineer = Engineer.getInstanceOfEngineer();
        System.out.println(instanceOfEngineer.hashCode());

        Constructor<Engineer> declaredConstructor = Engineer.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Engineer engineer = declaredConstructor.newInstance();
        System.out.println(engineer.hashCode());

        System.out.println(engineer.equals(instanceOfEngineer));

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        objectOutputStream.writeObject(engineer);
        System.out.println("Serialization done");

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.ob"));
        Object object = objectInputStream.readObject();
        System.out.println(object.hashCode());
        System.out.println(object.equals(engineer));

        /**
         * Ways to break the singleton design pattern
         *
         * 1. Reflection API to break the Singleton Design pattern
         * SOLUTION : 1-> if object is there ==> Throw Exception from inside the constructor
         * 2 -> Enum
         *
         * 2.Deserialization
         *SOLUTION :- Implementing readResolve() Method
         *
         */

    }
}
