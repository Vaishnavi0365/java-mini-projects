package mypackage;

import java.util.Scanner;

public class MadLibsGame {

    public static void main(String[] args) {

        // ===== VARIABLE DECLARATIONS =====
        String name;
        String jobTitle;
        String place;
        String adjective;
        String verb;

        // ===== SCANNER OBJECT =====
        Scanner scanner = new Scanner(System.in);

        // ===== USER INPUT SECTION =====
        System.out.print("Enter a Name: ");
        name = scanner.nextLine();

        System.out.print("Enter a Job Title: ");
        jobTitle = scanner.nextLine();

        System.out.print("Enter a Place: ");
        place = scanner.nextLine();

        System.out.print("Enter an Adjective: ");
        adjective = scanner.nextLine();

        System.out.print("Enter a Verb: ");
        verb = scanner.nextLine();

        System.out.println();

        // ===== STORY OUTPUT SECTION =====
        System.out.println(name + " got their first job as a " 
                + adjective + " " + jobTitle + " at " + place + ".");
        
        System.out.println("On the first day, " + name + " had to " 
                + verb + " and everyone appreciated it!");

        // ===== CLOSE SCANNER =====
        scanner.close();
    }
}
