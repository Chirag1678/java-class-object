import java.util.Scanner;

// Class to check if a string is palindrome or not
class PalindromeChecker {
    // Attribute
    private final String text;
    private boolean isPalindrome;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if string is palindrome
    public void checkPalindrome() {
        int start = 0, end = text.length() - 1;
        this.isPalindrome = true;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                this.isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
    }

    // Method to display the results
    public void displayResults() {
        System.out.println("String: " + this.text);
        if(this.isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}

// Main class
public class PalindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Create PalindromeChecker object
        PalindromeChecker palindromeChecker = new PalindromeChecker(text);

        // Check if string is palindrome
        palindromeChecker.checkPalindrome();

        // Display results
        palindromeChecker.displayResults();

        input.close();
    }
}
// Sample Input ->
// Enter a string: madam

// Sample Output ->
// String: madam
// The string is a palindrome.

// Sample Input ->
// Enter a string: hello

// Sample Output ->
// String: hello
// The string is not a palindrome.