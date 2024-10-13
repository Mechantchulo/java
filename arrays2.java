/*public class arrays2{
    public static void main(String[] args){
        int[] value = {10,20,30,40,50};

        for(int i=0; i<5;++i){
            System.out.println(value[i]);
        }
}
}*/

import java.util.Scanner;

public class arrays2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Name: ");
        String name = input.nextLine();

        System.out.println("Age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("Current_year: ");
        int current_year = input.nextInt();
        input.nextLine();

        int next_year = current_year + 1;

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Current_year: "+current_year);
        System.out.println("next_year_of_study: "+next_year);


    }
}