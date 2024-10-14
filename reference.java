//Objects and classes
/*class  student{
    String name;
    int id;
    String regno;
}
 public class reference{
    public static void main(String[] args){
        student s1 = new student();
        s1.name = "Erick";
        s1.id = 15517;
        s1.regno = "S13/02989/23";

        System.out.println("Name: "+s1.name);
        System.out.println("Id: "+s1.id);
        System.out.println("Regno: "+s1.regno);

        
 }
}*/

class users{
    String name;
    int id;
}

public class reference{
    public static void main(String[] args){
        users u1 = new users();
        u1.name = "Erick";
        u1.id = 15517;

        users u2 = new users();
        u2.name = "Danzo";
        u2.id = 232452;


        System.out.println("User1: "+u1.name);
        System.out.println("Id: "+u1.id);

        System.out.println("User2: "+u2.name);
        System.out.println("Id: "+u2.id);
    }
}