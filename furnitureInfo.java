// Define a class named 'furniture' to represent various furniture attributes.
class furniture {
    String name;  // Name of the furniture
    int num;      // Identification number for the furniture
    String size;  // Size of the furniture (e.g., small, medium, large)
    String shape; // Shape of the furniture (e.g., round, rectangle)
    double price; // Price of the furniture
}

// Main class to execute the program
public class furnitureInfo {
    public static void main(String[] args) {
        // Create and initialize the 'table' object with specific details
        furniture table = new furniture();
        table.name = "Round Table";
        table.num = 101;
        table.size = "Large";
        table.shape = "Rectangle";
        table.price = 1500.00;

        // Create and initialize the 'chair' object with specific details
        furniture chair = new furniture();
        chair.name = "Leather Chair";
        chair.num = 201;
        chair.size = "Medium";
        chair.shape = "Round";
        chair.price = 1000.00;

        // Create and initialize the 'bed' object with specific details
        furniture bed = new furniture();
        bed.name = "Comfortable Bed";
        bed.num = 301;
        bed.size = "Queen";
        bed.shape = "Rectangle";
        bed.price = 13000.00;

        // Declare a reference variable 'ref' of type 'furniture'
        furniture ref;

        // Assign the 'table' object to the reference variable 'ref' and display its information
        ref = table;
        displayInfo(ref);

        // Assign the 'chair' object to the reference variable 'ref' and display its information
        ref = chair;
        displayInfo(ref);

        // Assign the 'bed' object to the reference variable 'ref' and display its information
        ref = bed;
        displayInfo(ref);
    }

    // Method to display information of a furniture object
    public static void displayInfo(furniture furnitureInfo) {
        // Print details of the furniture passed as an argument
        System.out.println("Name: " + furnitureInfo.name);
        System.out.println("Number: " + furnitureInfo.num);
        System.out.println("Size: " + furnitureInfo.size);
        System.out.println("Shape: " + furnitureInfo.shape);
        System.out.println("Price: $" + furnitureInfo.price);
        System.out.println(); // Print an empty line for better readability
    }
}
