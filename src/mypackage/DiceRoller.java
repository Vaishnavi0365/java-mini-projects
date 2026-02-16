package mypackage;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int total = 0;

        // Taking number of dice from user
        System.out.print("Enter the number of dice to roll: ");
        numOfDice = scanner.nextInt();

        // Validation
        if (numOfDice > 0) {

            // Loop for rolling dice
            for (int i = 0; i < numOfDice; i++) {

                int roll = random.nextInt(1, 7); // generates number between 1 and 6
                printDie(roll); // print dice design

                System.out.println("You rolled: " + roll);
                total += roll;
            }

            System.out.println("----------------");
            System.out.println("Total: " + total);

        } else {
            System.out.println("Number of dice must be greater than zero!");
        }

        scanner.close();
    }

    // Method to print ASCII dice
    static void printDie(int roll) {

        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        // Switch to print correct dice
        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("INVALID ROLL");
        }
    }
}
