import java.util.Scanner;

// Class to book movie tickets
class MovieTocket {
    // Attributes
    private final String movieName;
    private String seatNumber;
    private double price;

    // Constructor
    public MovieTocket(String movieName) {
        this.movieName = movieName;
    }

    // Method to assign seat and update price
    public void assignSeat(int row, char seat) {
        this.seatNumber = row + "" + seat;
        if(row >= 1 && row <= 5) {
            if(seat >= 'A' && seat <= 'Z') {
                this.price = 300;
            } else {
                System.out.println("Invalid seat number.");
            }
        } else if(row >= 6 && row <= 10) {
            if(seat >= 'A' && seat <= 'Z') {
                this.price = 200;
            } else {
                System.out.println("Invalid seat number.");
            }
        } else {
            System.out.println("Invalid seat number.");
        }

    }

    // Method to display movie ticket details
    public void displayDetails() {
        System.out.println("Movie Name: " + this.movieName);
        System.out.println("Seat Number: " + this.seatNumber);
        System.out.println("Price: " + this.price);
    }
}

// Main class
public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input movie name
        System.out.print("Enter movie name: ");
        String movieName = input.nextLine();

        // Create movie ticket object
        MovieTocket movieTicket = new MovieTocket(movieName);

        // Input seat number
        System.out.print("Enter row number: ");
        int row = input.nextInt();

        System.out.print("Enter seat number: ");
        char seat = input.next().charAt(0);

        // Assign seat and update price
        movieTicket.assignSeat(row, seat);

        // Display movie ticket details
        System.out.println("Movie Ticket Details: ");
        movieTicket.displayDetails();

        input.close();
    }
}
// Sample Input ->
// Enter movie name: Inception
// Enter row number: 5
// Enter seat number: A

// Sample Output ->
// Movie Ticket Details:
// Movie Name: Inception
// Seat Number: 5A
// Price: 300.0