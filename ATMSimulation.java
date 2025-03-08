// Class to perform operations like depositing money, whitdrawing money, checking balance, etc.

import java.util.Scanner;

class BankAccount {
    // Attributes
    private final String accountHolder;
    private final String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit amount to account
    public void deposit(String accountNumber, double amount) {
        // Check if account number is correct
        if(this.accountNumber.equals(accountNumber)) {
            this.balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid account number.");
        }
    }

    // Method to withdraw amount 
    public void withdraw(String accountHolder, String accountNumber, double amount) {
        if(this.accountHolder.equals(accountHolder) && this.accountNumber.equals(accountNumber)){
            if(this.balance >= amount){
                this.balance -= amount;
                System.out.println("Amount withdrawn successfully.");
                System.out.println("Remaining balance: " + this.balance);
            } else {
                System.out.println("Insufficient balance.");
                System.out.println("Current balance: " + this.balance);
            }
        }
        else{
            System.out.println("Invalid account holder or account number.");
        }
    }

    // Method to display current balance
    public void checkBalance(String accountNumber) {
        if(this.accountNumber.equals(accountNumber)){
            System.out.println("Current balance: " + this.balance);
        }
    }
}

// Main class
public class ATMSimulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input account details
        System.out.print("Enter account holder name: ");
        String accountHolder = input.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = input.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = input.nextDouble();

        // Create bank account object
        BankAccount account = new BankAccount(accountHolder, accountNumber, balance);

        // Menu
        System.out.println("What you want to do?");
        System.out.println("1. Deposit money");
        System.out.println("2. Withdraw money");
        System.out.println("3. Check balance");

        int choice = input.nextInt();

        // Perform operations based on choice
        switch(choice) {
            case 1:
                System.out.print("Enter account number: ");
                String depositAccountNumber = input.next();
                System.out.print("Enter amount to deposit: ");
                double depositAmount = input.nextDouble();
                account.deposit(depositAccountNumber, depositAmount);
                break;
            case 2:
                System.out.print("Enter account holder name: ");
                String withdrawAccountHolder = input.next();
                System.out.print("Enter account number: ");
                String withdrawAccountNumber = input.next();
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = input.nextDouble();
                account.withdraw(withdrawAccountHolder, withdrawAccountNumber, withdrawAmount);
                break;
            case 3:
                System.out.print("Enter account number: ");
                String checkBalanceAccountNumber = input.next();
                account.checkBalance(checkBalanceAccountNumber);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

        input.close();
    }
}
// Sample Input ->
// Enter account holder name: John Doe
// Enter account number: 1234567890
// Enter initial balance: 5000

// What you want to do?
// 1. Deposit money
// 2. Withdraw money
// 3. Check balance

// 2
// Enter account holder name: John Doe
// Enter account number: 1234567890
// Enter amount to withdraw: 2000

// Sample Output ->
// Amount withdrawn successfully.
// Remaining balance: 3000.0