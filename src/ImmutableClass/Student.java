package ImmutableClass;

import java.util.ArrayList;
import java.util.List;


public final class Student {   // Rule 1: final class

    private final int id;      // Rule 2: final fields
    private String name;
    private List<String> courses;

    public Student(int id, String name, List<String> courses) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>(courses); // Rule 4: defensive copy // Create a new list to prevent external modification
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public List<String> getCourses() {
        return new ArrayList<>(courses); // Rule 5: defensive copy (VERY IMPORTANT)
    }
/**
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCourses(List<String> courses) {
        this.courses = courses;
    }
**/
    public static void main(String[] args) {

        List<String> courseList= new ArrayList<>();
        courseList.add("Math");
        courseList.add("Science");
        courseList.add("History");


        Student student = new Student(1, "John Doe", courseList);

        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Courses: " + student.getCourses());

//        student.setCourses(List.of("Hindi"));
        courseList.add("Hindi"); // This will not change the courses of student object because we are using defensive copy in constructor and getter method
    }
}
// Immutable class is a class whose objects cannot be modified after they are created (We can't change the values of instance variable ).
//ways to change the value of instance variable
//1. By using setter method
//2. By using reference variable of mutable object (like List, Set, Map etc) Basically getter Method. List<String> courses = student.getCourses(); courses.add("Hindi"); (Here we are changing the value of instance variable courses by using reference variable of List which is mutable object)
//3. By using constructor (if we have parameterized constructor and we are passing the value of instance variable through constructor then we can change the value of instance variable by passing different value through constructor)

