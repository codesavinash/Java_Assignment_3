package utility;


import java.util.Scanner;

public class Validator {
    private Scanner input = new Scanner(System.in);
    private int choice = 0;

    // constructor
    public Validator() {}

    public int validatePick(int maxVal) {
        choice = 0;

        while (true) {
            System.out.printf("Enter a number between 1 and %d:%n", maxVal);
            try {
                choice = Integer.parseInt(input.nextLine());
                if (choice >= 1 && choice <= maxVal) {
                    System.out.println("You entered: " + choice);
                    break; // valid input, exit loop
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            }  // try
            catch (NumberFormatException e) { // use Exception to catch input mismatch errors
                System.out.println("Invalid input. Please enter a valid integer.");
                input.nextLine(); // clear invalid input
            } // catch
            
            finally {
                // do nothing
            }
        } // while

        return choice;
    } // validatePick method

    public int validateAttackPick(int maxVal) {
        choice = 0;

        while (true) {
            System.out.printf("Enter a number between 1 and %d:%n", maxVal);
            try {
                choice = Integer.parseInt(input.nextLine());
                
                if (choice >= 1 && choice <= maxVal) {
                    System.out.println("You entered: " + choice);
                    break; // valid input, exit loop
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                input.nextLine(); // clear invalid input
            }
        } // while

        return choice;
    } // validateAttackPick method

} // Validator class