//Methods in java

/*class cars{
    String name;
    int year;
    String model;

    public void insertRecord(String i, int j,String k){
        name = i;
        year = j;
        model = k;
    }

    void displayRecord(){
        System.out.println("Name: "+name);
        System.out.println("Year: "+year);
        System.out.println("Model: "+model);
    }
}

public class methods{
    public static void main(String[] args){
        cars c1 = new cars();
        c1.insertRecord("Premio",1999,"Toyota");

        cars c2= new cars();
        c2.insertRecord("Note",1999,"Nissan");

        c1.displayRecord();
        c2.displayRecord();
    }
}*/

class employee{
    String name;
    int age;
    double salary;

    void insertRecord(String n, int j, double k){
        name = n;
        age = j;
        salary = k;
    }

    void displayRecord(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        
    }
}

public class methods{
    public static void main(String[] args) {

        employee emp1 = new employee();
        emp1.insertRecord("Erick", 19, 100000);
        
        employee emp2 = new employee();
        emp2.insertRecord("Winnie", 20, 100000);

        emp1.displayRecord();
        emp2.displayRecord();
    }
}