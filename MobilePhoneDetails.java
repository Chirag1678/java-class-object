// Class to diaply details of a mobile phone

import java.util.Scanner;

class MobilePhone {
    // Attributes
    private final String brand;
    private final String model;
    private final int price;

    // Constructor
    public MobilePhone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display the details of a mobile phone
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

// Mqain method
public class MobilePhoneDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the details of the mobile phone
        System.out.print("Enter the brand of the mobile phone: ");
        String brand = input.nextLine();

        System.out.print("Enter the model of the mobile phone: ");
        String model = input.nextLine();

        System.out.print("Enter the price of the mobile phone: ");
        int price = input.nextInt();

        // Create an object of the MobilePhone class
        MobilePhone mobilePhone = new MobilePhone(brand, model, price);

        // Display the details of the mobile phone
        System.out.println("Details of the mobile phone:");
        mobilePhone.displayDetails();

        input.close();
    }
}
// Sample Input ->
// Enter the brand of the mobile phone: Samsung
// Enter the model of the mobile phone: Galaxy M31
// Enter the price of the mobile phone: 14999

// Sample Output ->
// Details of the mobile phone:
// Brand: Samsung
// Model: Galaxy M31
// Price: 14999