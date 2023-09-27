package trio_program;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Selection {
	private Scanner scanner;
	private Set<Integer> questionsVisited = new HashSet<Integer>();
	private InputUtils inputUtils = new InputUtils();
	
	public Selection(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public void pickAQuestion() {
		boolean exit = false;
		int questionPicked;
		
		while(exit != true) {
			System.out.println("Selection Statement: \n");
			System.out.println("1. Determine odd or even" + (questionsVisited.contains(1)?" (Visited)":""));
			System.out.println("2. Determine if a year is a leap year or not"+ (questionsVisited.contains(2)?" (Visited)":""));
			System.out.println("3. Shipping cost" + (questionsVisited.contains(3)?" (Visited)":""));
			System.out.println("4. Go back to previous menu");
			
			System.out.print("\n Answer: ");
			questionPicked = inputUtils.getInteger(scanner);
			
			if(questionPicked == 1) {
				this.evenOrOdd();
				questionsVisited.add(1);
			}else if(questionPicked == 2) {
				this.leapYearOrNot();
				questionsVisited.add(2);
			}else if(questionPicked == 3) {
				this.shippingCostByWeight();
				questionsVisited.add(3);
			}else if(questionPicked == 4) {
				System.out.println("Exiting selection questions...");
				System.out.println("\n");
				exit = true;
			}else {
				System.out.println("Invalid Value, try again");
				System.out.println("\n");
			}
		}
	}
	private void evenOrOdd() {
		System.out.println("Even Or Odd");
		System.out.println("\n \n");
		System.out.println("Enter a number: ");
		int number = inputUtils.getInteger(scanner);
		
		if (number % 2 == 0) {
			System.out.println(number + " is an even number.");
		} else {
			System.out.println(number + " is an odd number.");
		}
		System.out.println("\n \n");
	}
	
	private void leapYearOrNot() {
		System.out.println("Is It A Leap Year?");
		System.out.println("\n \n");
		
		System.out.print("Enter a year: ");
		int year = inputUtils.getPositiveInteger(scanner);

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
		System.out.println("\n \n");
	}
	
	private void shippingCostByWeight() {
		System.out.println("Shipping Cost Calculation");
		System.out.println("\n \n");
		
		System.out.print("Enter the weight of the package in pounds: ");
		int weight = inputUtils.getPositiveInteger(scanner);
		
		int cost;
		
		if(weight <= 10) {
			cost = 250;
		}else {
			cost = 400;
		}
		System.out.println("Your package's total cost is: Php " + cost + ".00");
		System.out.println("\n \n");
	}
}
