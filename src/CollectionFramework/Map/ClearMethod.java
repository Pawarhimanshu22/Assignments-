package CollectionFramework.Map;
import java.util.HashMap;
import java.util.Map;

// how to use clear() in Map Interface
public class ClearMethod
{
    public static void main(String[] args)
    {
        Map m1=new HashMap();
        m1.put("student 1", "Manish");
        m1.put("student 2", "Abhishek");
        m1.put("student 3", "Sunita");
        m1.put("student 4", "Jeetu");

        System.out.println(m1);
        m1.clear();
        //Clears and removes all the mappings
        System.out.println(m1);
    }
}