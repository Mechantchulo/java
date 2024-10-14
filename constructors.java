/*Constructors are special methods to initialize objects
They are called when a new object is created
In Java, constructors have the same name as the class and do not have a return type
Constructors can have parameters, just like methods, but they do not have a return type*/

//default constructor has no parameters

/*class Dog{
    String name;
    String breed;
    int age;
    double height;

    Dog(){
        name = "Mickey";
        breed = "Golden Retriever";
        age = 5;
        height = 25.5;
    }
}

public class constructors{
    public static void main(String[] args){
        Dog d1 = new Dog();
        System.out.println("Name: "+d1.name);
        System.out.println("Breed: "+d1.breed);
        System.out.println("Age: "+d1.age);
        System.out.println("Height: "+d1.height);

        
}
}*/

//parameterized constructors

class cat{
    String name;
    int age;

    cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    void displayRecord(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

}

public class constructors{
    public static void main(String[] args) {

        cat cat1 = new cat("whiskers", 5);
        cat cat2 = new cat("Danzo", 7);

        cat1.displayRecord();
        cat2.displayRecord();
        
    }
}

