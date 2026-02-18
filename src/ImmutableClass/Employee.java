package ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public final class Employee {
//    If class contains mutable field → ALWAYS do defensive copy in constructor AND getter
    int id;
    String name;
    List<String> projects;

    public Employee(int id, String name, List<String> projects) {
        this.id = id;
        this.name = name;
        this.projects = new ArrayList<>(projects); // Defensive Copy
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public List<String> getProjects() {
        return new ArrayList<>(projects);
    }

//    public void setProjects(List<String> projects) {
//        this.projects = projects;
//    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", projects=" + projects +
                '}';
    }
}
