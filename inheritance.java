//inheritance

class student{
    String name;
    int age;
}

class local_student extends student{
    int id_no;
}

public class inheritance{
    public static void main(String[] args){

        local_student Ls = new local_student();
        Ls.name = "Erick";
        Ls.age = 19;
        Ls.id_no = 15517;

        System.out.println("Name: "+Ls.name);
        System.out.println("Age: "+Ls.age);
        System.out.println("Id_no: "+Ls.id_no);
}
}