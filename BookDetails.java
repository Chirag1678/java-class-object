import java.util.Scanner;

// Class to handle user input and print book details
class Book {
    // Attributes
    private final String title;
    private final String author;
    private final int price;

    // Constructor
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

// main method to take user input
public class BookDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int numBooks = input.nextInt();

        // Create an array of Books
        Book[] books = new Book[numBooks];

        // Take user input for details
        for(int i = 0; i < numBooks; i++){
            System.out.println("Enter details for book " + (i + 1));
            System.out.print("Title: ");
            String title = input.nextLine();
            input.nextLine();
            System.out.print("Author: ");
            String author = input.nextLine();
            System.out.print("Price: ");
            int price = input.nextInt();
            books[i] = new Book(title, author, price);
        }

        // Display details of each book
        System.out.println("Book Details:");
        for(Book book : books){
            book.displayDetails();
            System.out.println();
        }

        input.close();
    }
}
// Sample Input ->
// Enter number of books: 2

// Enter details for book 1
// Title: Harry Potter
// Author: J.K. Rowling
// Price: 500

// Enter details for book 2
// Title: The Alchemist
// Author: Paulo Coelho
// Price: 300

// Sample Output ->
// Book Details:
// Title: Harry Potter
// Author: J.K. Rowling
// Price: 500

// Title: The Alchemist
// Author: Paulo Coelho
// Price: 300