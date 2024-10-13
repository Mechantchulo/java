//Arrays
import java.util.Scanner;
public class Arrays{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;

        for(int i=0;i<numbers.length; i++){
            System.out.println("Enter number: ");
            numbers[i] = input.nextInt();

            sum +=numbers[i];
        }

        System.out.println("sum of all numbers: "+sum);


    }
}