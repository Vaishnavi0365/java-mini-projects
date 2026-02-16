package mypackage;

import java.util.Scanner;

public class SimpleBankingSystem {

    // Creating Scanner object as static so all methods can use it
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Initial balance of the user
        double balance = 1000;

        // Variable to control the loop
        boolean isRunning = true;

        int choice;

        // Loop runs until user selects Exit
        while (isRunning) {

            // Display menu
            System.out.println("-------------------");
            System.out.println("BANKING PROGRAM");
            System.out.println("-------------------");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("-------------------");

            // Taking user choice
            System.out.print("Enter Your Choice (1-4): ");
            choice = scanner.nextInt();

            // Switch case for menu options
            switch (choice) {

                // Show current balance
                case 1 -> showBalance(balance);

                // Deposit money and update balance
                case 2 -> balance += deposit();

                // Withdraw money and update balance
                case 3 -> balance -= withdraw(balance);

                // Exit the program
                case 4 -> isRunning = false;

                // If invalid choice
                default -> System.out.println("INVALID CHOICE");
            }
        }

        // Closing message
        System.out.println("-------------------");
        System.out.println("Thank you! Have a nice day!");

        // Closing scanner to avoid memory leak
        scanner.close();
    }

    // Method to display balance
    static void showBalance(double balance) {
        System.out.println("-------------------");

        // Printing balance with Rupee symbol and 2 decimal places
        System.out.printf("Current Balance: ₹%.2f\n", balance);
    }

    // Method to deposit money
    static double deposit() {

        System.out.print("Enter amount to deposit: ");
        double amt = scanner.nextDouble();

        // Validation for negative or zero amount
        if (amt <= 0) {
            System.out.println("Amount must be positive!");
            return 0;
        }

        return amt;
    }

    // Method to withdraw money
    static double withdraw(double balance) {

        System.out.print("Enter amount to withdraw: ");
        double amt = scanner.nextDouble();

        // Validation for wrong amount
        if (amt <= 0) {
            System.out.println("Amount must be positive!");
            return 0;
        }

        // Check for sufficient balance
        else if (amt > balance) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }

        return amt;
    }
}
