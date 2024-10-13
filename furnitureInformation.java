import java.util.Scanner;

// Define a class named 'furniture' to represent various furniture attributes.
class furniture {
    String name; // Name of the furniture
    int num;     // Number of pieces available
    String size; // Size of the furniture (e.g., small, medium, large)
    String shape;// Shape of the furniture (e.g., round, square)
    double price;// Price of the furniture
}

// Main class to execute the program
public class furnitureInformation {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create objects for different types of furniture
        furniture table = new furniture();
        furniture chair = new furniture();
        furniture bed = new furniture();

        // Read in data for the table object
        System.out.println("Details for table: " );
        System.out.print("Name: ");
        table.name = input.nextLine(); // Input name for table

        System.out.print("Number: ");
        table.num = input.nextInt(); // Input number of tables
        input.nextLine(); // Consume the leftover newline

        System.out.print("Size: ");
        table.size = input.nextLine(); // Input size of the table

        System.out.print("Shape: ");
        table.shape = input.nextLine(); // Input shape of the table

        System.out.print("Price: ");
        table.price = input.nextDouble(); // Input price of the table
        input.nextLine(); // Consume the leftover newline

        // Read in data for the chair object
        System.out.println("Details for chair: " );
        System.out.print("Name: ");
        chair.name = input.nextLine(); // Input name for chair

        System.out.print("Number: ");
        chair.num = input.nextInt(); // Input number of chairs
        input.nextLine(); // Consume the leftover newline

        System.out.print("Size: ");
        chair.size = input.nextLine(); // Input size of the chair

        System.out.print("Shape: ");
        chair.shape = input.nextLine(); // Input shape of the chair

        System.out.print("Price: ");
        chair.price = input.nextDouble(); // Input price of the chair
        input.nextLine(); // Consume the leftover newline

        // Read in data for the bed object
        System.out.println("Details for bed: " );
        System.out.print("Name: ");
        bed.name = input.nextLine(); // Input name for bed

        System.out.print("Number: ");
        bed.num = input.nextInt(); // Input number of beds
        input.nextLine(); // Consume the leftover newline

        System.out.print("Size: ");
        bed.size = input.nextLine(); // Input size of the bed

        System.out.print("Shape: ");
        bed.shape = input.nextLine(); // Input shape of the bed

        System.out.print("Price: ");
        bed.price = input.nextDouble(); // Input price of the bed
        input.nextLine(); // Consume the leftover newline

        // Display information for each furniture object using a helper method
        displayInfo(table);
        displayInfo(chair);
        displayInfo(bed);
        
        // Close the scanner to avoid memory leaks
        input.close();
    }

    // Method to display information for a furniture object
    public static void displayInfo(furniture furnitureInformation){
        System.out.println("Name: " + furnitureInformation.name);
        System.out.println("Number: " + furnitureInformation.num);
        System.out.println("Size: " + furnitureInformation.size);
        System.out.println("Shape: " + furnitureInformation.shape);
        System.out.println("Price: $" + furnitureInformation.price);
        System.out.println(); // Add an empty line for better readability
    }
}
