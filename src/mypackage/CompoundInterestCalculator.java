package mypackage;

import java.util.Scanner;

public class CompoundInterestCalculator {

    public static void main(String[] args) {

        // ===== SCANNER OBJECT =====
        // Used to take input from the user
        Scanner scanner = new Scanner(System.in);

        // ===== VARIABLE DECLARATION =====
        double principal;        // Initial amount
        double rate;             // Interest rate
        int timesCompounded;     // Number of times interest is compounded per year
        int years;               // Time period in years
        double amount;           // Final amount after interest

        // ===== INPUT SECTION =====
        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;   // Convert percentage to decimal

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        // ===== COMPOUND INTEREST FORMULA =====
        // Formula: A = P * (1 + r/n)^(n*t)
        amount = principal * Math.pow( 1 + rate / timesCompounded, timesCompounded * years);

        // ===== OUTPUT SECTION =====
        System.out.printf("\nThe amount after %d years is: %.2f", years, amount);

        // ===== CLOSE SCANNER =====
        // Frees system resources
        scanner.close();
    }
}
