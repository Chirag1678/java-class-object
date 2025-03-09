import java.util.ArrayList;
import java.util.Scanner;

// Class to simulate a shopping cart item
class CartItem {
    // Attributes
    private final String itemName;
    private final double price;
    private final int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    //getter for itemName
    public String getItemName() {
        return this.itemName;
    }

    // Method to return total cost
    public double getTotalCost() {
        return this.price * this.quantity;
    }

}

// Class to simulate a shopping cart
class Cart {
    // Attributes
    ArrayList<CartItem> items;

    // Constructor
    public Cart() {
        this.items = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        CartItem item = new CartItem(itemName, price, quantity);
        this.items.add(item);
        System.out.println("Item added to cart: " + itemName);
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getItemName().equals(itemName)) {
                this.items.remove(i);
                System.out.println("Item removed from cart: " + itemName);
                return;
            }
        }
        System.out.println("Item not found in cart: " + itemName);
    }

    // Method to display total cost of the cart
    public void displayTotal() {
        double total = 0;
        for (CartItem item : this.items) {
            total += item.getTotalCost();
        }
        System.out.println("Total cost of items in cart: " + total);
    }

}

// Main class
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create cart object
        Cart cart = new Cart();

        // Menu
        while (true) {
            System.out.println("1. Add item to cart");
            System.out.println("2. Remove item from cart");
            System.out.println("3. Display total cost");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = input.next();
                    System.out.print("Enter item price: ");
                    double price = input.nextDouble();
                    System.out.print("Enter item quantity: ");
                    int quantity = input.nextInt();
                    cart.addItem(itemName, price, quantity);
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    String itemToRemove = input.next();
                    cart.removeItem(itemToRemove);
                    break;
                case 3:
                    cart.displayTotal();
                    break;
                case 4:
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
        }
    }
}
// Sample Input ->
// 1. Add item to cart
// 2. Remove item from cart
// 3. Display total cost
// 4. Exit
// Enter your choice: 1
// Enter item name: Laptop
// Enter item price: 50000
// Enter item quantity: 1

// Enter your choice: 1
// Enter item name: Mouse
// Enter item price: 500
// Enter item quantity: 2

// Enter your choice: 3

// Sample Output ->
// Item added to cart: Laptop
// Item added to cart: Mouse
// Total cost of items in cart: 51000.0

// Enter your choice: 2
// Enter item name to remove: Mouse

// Sample Output ->
// Item removed from cart: Mouse

// Enter your choice: 3

// Sample Output ->
// Total cost of items in cart: 50000.0

// Enter your choice: 4

// Sample Output ->
// Program exits.