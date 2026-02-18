package Singleton_Design_Pattern;

import com.sun.source.tree.EnhancedForLoopTree;

public class Engineer {

    private static Engineer engineer;

    //1. Constructor Should be Private
    private Engineer()
    {

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
}
/**
 * 1. Constructor Should be private
 *
 * 2. Object Create with static method()[Factory method]
 *
 * 3. Create field to store the object
 *
 */
