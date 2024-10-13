//intro to read-in using scanner 
import java.util.Scanner;  // Import the Scanner class to get user input

public class StudentInfo {  // Define a public class named 'StudentInfo', which matches the file name
    public static void main(String[] args) {  // The main method is where the program starts execution

        // Create a Scanner object to read input from the user via the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their full name and store the result in a String variable
        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();  // 'nextLine()' reads the entire line, including spaces

        // Prompt the user to enter their age and store the result in an int variable
        System.out.print("Enter your age: ");
        int age = input.nextInt();  // 'nextInt()' reads an integer value from the user

        // Prompt the user to enter their height (in centimeters) and store it in a double variable
        System.out.print("Enter your height in cm: ");
        double height = input.nextDouble();  // 'nextDouble()' reads a decimal number

        // Consume the leftover newline character from the previous 'nextInt()' or 'nextDouble()' call
        input.nextLine();  // This is necessary because 'nextInt()' and 'nextDouble()' don't consume the newline

        // Prompt the user to enter their course (e.g., the program they are studying)
        System.out.print("Enter your course: ");
        String course = input.nextLine();  // 'nextLine()' again reads the entire line of text, including spaces

        // Prompt the user to enter their current year of study (e.g., 1st, 2nd, etc.)
        System.out.print("Enter your current year of study: ");
        int currentYear = input.nextInt();  // 'nextInt()' reads the integer value of the current year of study

        // Calculate the next year of study by adding 1 to the current year
        int nextYearOfStudy = currentYear + 1;

        // Display all the collected and calculated information to the user
        System.out.println("\n--- Student Information ---");  // Print a title for the information
        System.out.println("Full Name: " + fullName);  // Print the full name entered by the user
        System.out.println("Age: " + age);  // Print the age entered by the user
        System.out.println("Height: " + height + " cm");  // Print the height entered by the user
        System.out.println("Course: " + course);  // Print the course entered by the user
        System.out.println("Current Year of Study: " + currentYear);  // Print the current year of study
        System.out.println("Next Year of Study: " + nextYearOfStudy);  // Print the calculated next year of study

        // Close the Scanner object to free up resources (good practice)
        input.close();
    }
}
