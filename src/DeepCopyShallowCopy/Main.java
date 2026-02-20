package DeepCopyShallowCopy;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
}

class Employee implements Cloneable {
    int id;
    Address address;

    Employee(int id, Address address) {
        this.id = id;
        this.address = address;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", address=" + address +
                '}';
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone(); // SHALLOW COPY
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        Address addr = new Address("Indore");

        Employee e1 = new Employee(101, addr);
        Employee e2 = (Employee) e1.clone();

        e2.address.city = "Bhopal";

        System.out.println(e1.address.city);

        System.out.println(e1);
        System.out.println(e2);
    }
}
