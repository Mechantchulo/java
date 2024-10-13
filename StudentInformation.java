//Inheritance
class Student{
    String name;
    int age;
}

class Local_student extends Student{
    int id_no;
}

public class StudentInformation{
    public static void main(String[] args){
        Local_student Ls = new Local_student();
        Ls.name = "Erick";
        Ls.age = 19;
        Ls.id_no = 15517;

        System.out.println("Name: "+Ls.name);
        System.out.println("Age: "+Ls.age);
        System.out.println("Id_no: "+Ls.id_no);
    }
}