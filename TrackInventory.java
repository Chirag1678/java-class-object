import java.util.Scanner;

// Class to display item details and calculate total cost for a given quantity
class Item {
    // Attributes
    private final String itemCode;
    private final String itemName;
    private final int price;

    // Constructor
    public Item(String itemCode, String itemName, int price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }
}


// Main method to take user input and calculate total cost for a given quantity
public class TrackInventory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // take user input for code, name and price of the item
        System.out.print("Enter item code: ");
        String itemCode = input.next();
        input.nextLine();

        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter price: ");
        int price = input.nextInt();

        // create an object of Item class
        Item item = new Item(itemCode, itemName, price);

        // display item details
        item.displayItemDetails();

        // take user input for quantity
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        // calculate total cost for the given quantity
        double totalCost = item.calculateTotalCost(quantity);

        // display total cost
        System.out.println("Total cost: " + totalCost);

        input.close();
    }
}
// Sample Input ->
// Enter item code: 101
// Enter item name: Pen
// Enter price: 10

// Enter quantity: 5

// Sample Output ->
// Item Code: 101
// Item Name: Pen
// Price: 10

// Total cost: 50.0