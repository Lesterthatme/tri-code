package trio_program;

import java.util.Scanner;

public class InputUtils {
	public int getPositiveInteger(Scanner scanner) {
	    int input = 0;
	    boolean validInput = false;

	    while (!validInput) {
	        try {	            
	            input = scanner.nextInt();

	            if (input <= 0) {
	                System.out.println("Invalid input, please enter a positive integer");
	                System.out.print("Enter: ");
	            } else {
	                validInput = true;
	            }
	        } catch (Exception e) {
	            System.out.println("Invalid input, please enter a positive integer");
	            System.out.print("Enter: ");
	            scanner.nextLine(); // Clear the input buffer
	        }
	    }
	    return input;
	}
	
	public int getInteger(Scanner scanner) {
		int input = 0;
	    boolean validInput = false;

	    while (!validInput) {
	        try {	            
	            input = scanner.nextInt();
	            validInput = true;
	        } catch (Exception e) {
	            System.out.println("Invalid input, please enter an integer");
	            System.out.print("Enter: ");
	            scanner.nextLine(); // Clear the input buffer
	        }
	    }
	    return input;
	}
	
	
	public double getDouble(Scanner scanner) {
		double input = 0;
	    boolean validInput = false;

	    while (!validInput) {
	        try {	            
	            input = scanner.nextDouble();
	            validInput = true;
	        } catch (Exception e) {
	            System.out.println("Invalid input, please a valid whole number");
	            System.out.print("Enter: ");
	            scanner.nextLine(); // Clear the input buffer
	        }
	    }
	    return input;
	}
}
