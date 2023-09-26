package trio_program;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Iteration {
	private Scanner scanner;
	private Set<Integer> questionsVisited = new HashSet<Integer>();
	private InputUtils inputUtils = new InputUtils();
	
	public Iteration(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public void pickAQuestion() {
		boolean exit = false;
		int questionPicked;
		
		while(exit != true) {
			System.out.println("Selection Statement: \n");
			System.out.println("1. First 10 Fibonacci numbers" + (questionsVisited.contains(1)?" (Visited)":""));
			System.out.println("2. ATM simulation"+ (questionsVisited.contains(2)?" (Visited)":""));
			System.out.println("3. Multiplication Table of a given number" + (questionsVisited.contains(3)?" (Visited)":""));
			System.out.println("4. Go back to previous menu");
			
			System.out.print("\n Answer: ");
			questionPicked = inputUtils.getInteger(scanner);
			if(questionPicked == 1) {
				this.fibonacciNumbers();
				questionsVisited.add(1);
			}else if(questionPicked == 2) {
				this.atmSimulation();
				questionsVisited.add(2);
			}else if(questionPicked == 3) {
				this.multiplicationTable();
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

	private void fibonacciNumbers() {
		System.out.println("First 10 Fibonacci Numbers");
		System.out.println("\n \n");
		int currentNumber = 0;
		int previousNumber = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println(currentNumber);
			if(currentNumber == 0) {
				currentNumber = 1;
			}else {
				int temp = currentNumber;
				currentNumber = currentNumber + previousNumber;
				previousNumber = temp;
			}
		}
		System.out.println("\n \n");
	}
	
	private void atmSimulation() {
		System.out.println("ATM Simulation");
		System.out.println("\n \n");
		System.out.println("Input initial money in ATM account: ");
    int balance = inputUtils.getPositiveInteger(scanner);
		ATM atm = new ATM(balance);
		System.out.println("Initialized bank account with Php " + balance);		
		boolean exitAtm = false;
		int answer;
		while (exitAtm == false) {
			System.out.println("ATM Main Screen");
			System.out.println("Press 1 to withraw");
			System.out.println("Press 2 to exit");
			System.out.print("Enter your choice: ");
			answer = inputUtils.getPositiveInteger(scanner);
			if(answer == 1) {
				int amountToWithraw;
				System.out.println("\nCurrent balance: "+atm.getBalance());
				System.out.println("How much would you like to withraw?");
				System.out.print("Enter amount here: ");
				amountToWithraw = inputUtils.getPositiveInteger(scanner);
				if(atm.isWithdrawalValid(amountToWithraw)) {
					atm.withdraw(amountToWithraw);
					System.out.println("Updated balance: "+ atm.getBalance() + "\n");
				}else {
					System.out.println("Error: You don't have enough money");
				}
			}else if(answer == 2) {
				System.out.println("Shutting down ATM...");
				exitAtm = true;
			}
		}
		
		System.out.println("\n \n");
	}
	
	private void multiplicationTable() {
		System.out.println("Multiplication Table");
		System.out.println("\n \n");
		
		int number;
		System.out.print("Enter a number: ");
		number = inputUtils.getInteger(scanner);
		
		for (int i = 1; i <= 10; i++) {
        int result = number * i;
        System.out.println(number + " x " + i + " = " + result);
    }
		System.out.println("\n \n");
	}
}
