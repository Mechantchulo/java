//Objects and classes
class  student{
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
}