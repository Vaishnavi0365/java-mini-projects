package mypackage;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        // Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Variable declarations
        double temp;       // Original temperature
        double newTemp;    // Converted temperature
        String unit;       // Target unit (C or F)

        // ===== INPUT SECTION =====
        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        // ===== TERNARY OPERATOR LOGIC =====
        // If unit is C → convert Fahrenheit to Celsius
        // Else → convert Celsius to Fahrenheit
        newTemp = (unit.equals("C"))
                ? (temp - 32) * 5 / 9          // F → C
                : (temp * 9 / 5) + 32;         // C → F

        // ===== OUTPUT SECTION =====
        System.out.printf("Converted Temperature: %.1f°%s", newTemp, unit);

        // Close scanner
        scanner.close();
    }
}
