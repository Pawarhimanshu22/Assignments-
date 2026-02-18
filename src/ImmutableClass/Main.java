package ImmutableClass;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> project = new ArrayList<>();
        project.add("Project A");
        project.add("Project B");
        project.add("Project C");

        Employee employee = new Employee(1, "Himanshu", project);

        System.out.println(employee);
        project.add("Project d");
        System.out.println(employee);

        employee = new Employee(3, "Himanshu Pawar", project);

        System.out.println(employee);

        project.add( "Samajik Vigyan");
        Employee employee1 = new Employee(4, "Raja", project);
        System.out.println(employee1);
    }
}
