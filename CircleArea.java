import java.util.Scanner;

// Class to Calculate Area of Circle
class Circle {
    private final double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of circle
    public double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference of circle
    public double circumference(){
        return 2 * Math.PI * radius;
    }

    // Method to display area of circle
    public void displayArea() {
        System.out.printf("Area of circle: %.2f", area());
    }

    // Method to display circumference of circle
    public void displayCircumference(){
        System.out.printf("Circumference of circle: %.2f", circumference());
    }
}

// Main class to take user input and computer area
public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        double radius = input.nextDouble();

        // Create an object of circle class with the given rdius
        Circle circle = new Circle(radius);

        // Print the calculated area and circumference of circle
        circle.displayArea();
        System.out.println();
        circle.displayCircumference();

        input.close();
    }
}
// Sample Input ->
// Enter the radius of circle: 5.43

// Sample Output ->
// Area of circle: 92.63
// Circumference of circle: 34.12