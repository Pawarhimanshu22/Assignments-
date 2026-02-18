package Singleton_Design_Pattern.Way_to_Break;

public class Engineer {

    private static Engineer engineer;

    //1. Constructor Should be Private
    private Engineer()
    {
        if (engineer != null)
        {
            throw new RuntimeException("You are trying to break the singleton design pattern :");
        }

    }
    //Lazy Initialization (Lazy way of creatinng the singleton object )
    //Return Object Of this calss
    public static Engineer getInstanceOfEngineer()
    {
//        Engineer engineer = new Engineer();
        if (engineer == null)
        {
            synchronized (Engineer.class)
            {
                engineer = new Engineer();
            }
        }
        return engineer;

    }

    public Object readResolve()
    {
        return engineer;
    }

}
/**
 * 1. Constructor Should be private
 *
 * 2. Object Create with static method()[Factory method]
 *
 * 3. Create field to store the object
 *
 */
