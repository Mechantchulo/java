//Aggregations
class Address{
    String street;
    String city;

    public Address(String street, String city){
        this.street = street;
        this.city = city;
    }
}

class Student{
    int age;
    String name;
    Address address;

    public Student(int age, String name,Address address){
        this.age = age;
        this.name = name;
        this.address = address;
}

void display(){
    System.out.println(age+ " "+name+ " "+address.street+" "+address.city);

}
}

public class Aggregate{
    public static void main(String[] args){
        Address a1 = new Address("Njoro","Egerton");
        Address a2 = new Address("Mwembe", "Mombasa");

        Student s1 = new Student(19, "Erick", a1);
        Student s2 = new Student(19, "Peter", a2);

        s1.display();
        s2.display();

    }
}
