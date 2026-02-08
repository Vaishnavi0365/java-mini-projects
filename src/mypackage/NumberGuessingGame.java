package mypackage;

// Import Random class to generate random numbers
import java.util.Random;

// Import Scanner class to take user input
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        // Create Random object
        Random random = new Random();

        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Variable to store user's guess
        int guess;

        // Variable to count number of attempts
        int attempts = 0;

        // Define minimum and maximum range
        int min = 1;
        int max = 100;

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(min, max + 1);

        // Display game title
        System.out.println("===== NUMBER GUESSING GAME =====");

        // Display guessing range
        System.out.printf("Guess a number between %d and %d%n", min, max);

        // do-while loop ensures at least one guess
        do {
            // Ask user to enter a guess
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            // Increase attempt count
            attempts++;

            // Check if guess is too low
            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            }
            // Check if guess is too high
            else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            }
            // Correct guess
            else {
                System.out.println("🎉 You won!");
                System.out.println("Number of attempts: " + attempts);
            }

        } while (guess != randomNumber); // Loop continues until correct guess

        // Close scanner to release resources
        scanner.close();
    }
}
