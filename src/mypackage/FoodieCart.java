package mypackage;

import java.util.Scanner;

public class FoodieCart {

    public static void main(String[] args) {

        // Variables to store quantity of each item
        int pizzaQty;
        int burgerQty;
        int friesQty;
        int totalBill;

        // Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Display menu
        System.out.println("----- MENU -----");
        System.out.println("Pizza  : ₹100");
        System.out.println("Burger : ₹90");
        System.out.println("Fries  : ₹50");

        // Taking pizza quantity
        System.out.print("\nHow many Pizzas do you want? ");
        pizzaQty = scanner.nextInt();

        // Taking burger quantity
        System.out.print("How many Burgers do you want? ");
        burgerQty = scanner.nextInt();
        
        // Taking fries quantity
        System.out.print("How many Fries do you want? ");
        friesQty = scanner.nextInt();

        // Prices of each item
        int pizzaPrice = 100;
        int burgerPrice = 90;
        int friesPrice = 50;

        // Calculating total bill
        totalBill = (pizzaQty * pizzaPrice) 
                  + (burgerQty * burgerPrice) 
                  + (friesQty * friesPrice);

        // Display bill
        System.out.println("\n----- BILL -----");
        System.out.println("Pizza Quantity  : " + pizzaQty);
        System.out.println("Burger Quantity : " + burgerQty);
        System.out.println("Fries Quantity  : " + friesQty);
        System.out.println("Total Bill      : ₹" + totalBill);

        // Closing the scanner
        scanner.close();
    }
}
