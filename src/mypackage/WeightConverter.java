package mypackage;

import java.util.Scanner;

public class WeightConverter {

    public static void main(String[] args) {

        // ===== SCANNER OBJECT =====
        // Used to take input from the user
        Scanner scanner = new Scanner(System.in);

        // ===== VARIABLE DECLARATIONS =====
        double weight;      // Original weight entered by the user
        double newWeight;   // Converted weight
        int choice;         // User's menu choice

        // ===== PROGRAM TITLE =====
        System.out.println("--- Weight Conversion Program ---");

        // ===== MENU OPTIONS =====
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        // Ask user to choose conversion type
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        // ===== CONVERSION LOGIC =====
        if (choice == 1) {

            // Pounds to Kilograms conversion
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 0.453592;  // lbs → kgs

            System.out.printf("The weight in kilograms is: %.3f kg", newWeight);

        } else if (choice == 2) {

            // Kilograms to Pounds conversion
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 2.20462;   // kgs → lbs

            System.out.printf("The weight in pounds is: %.3f lbs", newWeight);

        } else {

            // Invalid menu choice
            System.out.println("That was not a valid choice!");
        }

        // ===== CLOSE SCANNER =====
        // Frees system resources
        scanner.close();
    }
}
