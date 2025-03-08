// Class Definition to store the restaurant details
class Restaurant {
    // Attributes
    private String name;
    private String location;
    private String foodItems[];

    // Constructor
    public Restaurant(String name, String location, String[] foodItems) {
        this.name = name;
        this.location = location;
        this.foodItems = foodItems;
    }

    // Method to display restaurant details
    public void displayDetails() {
        System.out.println("Restaurant name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Food Items: ");
        for (String item : foodItems) {
            System.out.println("-" + item);
        }
    }

    // Method to check if a food item is availabale
    public boolean isFoodAvailable(String food) {
        for(String item : foodItems){
            if(item.equalsIgnoreCase(food)){
                return true;
            }
        }
        return false;
    }
}

// Main class to test
public class FoodDeliveryApp {
    public static void main(String[] args) {
        // Define food items for restaurant
        String[] foodItems1 = {"Pizza", "Pasta", "Burger"};
        String[] foodItems2 = {"Sushi", "Ramen", "Tempura"};

        // Create restaurant objects
        Restaurant res1 = new Restaurant("Italian Delight", "Downtown", foodItems1);
        Restaurant res2 = new Restaurant("Tokyo Treats", "Uptown", foodItems2);

        // Display details of each restaurant
        System.out.println("Restaurant 1:");
        res1.displayDetails();
        System.out.println("Restaurant 2:");
        res2.displayDetails();

        // Check food availability
        System.out.println("\n Checking availability of food items...");
        System.out.println("Is Pizza available in Italian Delight? " + res1.isFoodAvailable("Pizza"));
        System.out.println("Is Ramen available in Italian Delight? " + res1.isFoodAvailable("Ramen"));
    }
}