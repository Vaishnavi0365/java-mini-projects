package mypackage;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        // Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // ===== VARIABLE DECLARATIONS =====
        double num1;                 // First number
        double num2;                 // Second number
        char operator;               // Operator (+, -, *, /, ^)
        double result = 0;           // Stores calculation result
        boolean validOperation = true; // Flag to track valid operations

        // ===== INPUT SECTION =====
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        // ===== CALCULATION USING ENHANCED SWITCH =====
        switch (operator) {

            case '+' -> result = num1 + num2;   // Addition

            case '-' -> result = num1 - num2;   // Subtraction

            case '*' -> result = num1 * num2;   // Multiplication

            case '/' -> {                        // Division
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }

            case '^' -> result = Math.pow(num1, num2); // Power

            default -> {                               // Invalid operator
                System.out.println("Invalid operator!");
                validOperation = false;
            }
        }

        // ===== OUTPUT SECTION =====
        if (validOperation) {
            System.out.println("Result: " + result);
        }

        // Close scanner
        scanner.close();
    }
}
