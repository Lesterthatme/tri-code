package trio_program;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sequential {
	private Scanner scanner;
	private Set<Integer> questionsVisited = new HashSet<Integer>();
	
	public Sequential(Scanner scanner) {
		this.scanner = scanner;
	}

	public void pickAQuestion() {
		boolean exit = false;
		int questionPicked;
		
		while(exit != true) {
			
			System.out.println("Sequential Statement: \n");
			System.out.println("1. Calculate the area of a rectangle" + (questionsVisited.contains(1)?" (Visited)":""));
			System.out.println("2. Convert Fahrenheit to Celsius"+ (questionsVisited.contains(2)?" (Visited)":""));
			System.out.println("3. Compute the area, circumference, and diameter of a circle" + (questionsVisited.contains(3)?" (Visited)":""));
			System.out.println("4. Go back to previous menu");
			
			System.out.print("\n Answer: ");
			questionPicked = scanner.nextInt();
			
			System.out.print("\n");
			
			if(questionPicked == 1) {
				this.areaOfRectangle();
				questionsVisited.add(1);
			}else if(questionPicked == 2) {
				this.fahrenheightToCelsius();
				questionsVisited.add(2);
			}else if(questionPicked == 3) {
				this.circleCalculations();
				questionsVisited.add(3);
			}else if(questionPicked == 4) {
				System.out.println("Exiting sequential questions...");
				System.out.println("\n");
				exit = true;
			}else {
				System.out.println("Invalid Value, try again");
				System.out.println("\n");
			}
		}
		
	}
	
	private void circleCalculations() {
		System.out.println("Area, Circumference and Diameter of a circle");
		System.out.print("\n");
		System.out.println("Alert: Program is not using any particular metric unit \n \n");
		
		 double radius,diameter,circumference, area;
         System.out.println("Enter radius: ");
         radius = scanner.nextDouble();

         diameter = 2*radius;
         circumference = 2*Math.PI*radius;
         area = 3.14*(radius*radius);

         System.out.println("Area: "+ area);
         System.out.println("Circumference: "+ circumference);
         System.out.println("Diameter: "+ diameter);
         System.out.println("\n");
	}
	
	private void fahrenheightToCelsius(){
		System.out.println("Fahrenheit to Celsius");
		System.out.print("\n\n");
		 double fahrenheit, celsius;
		 
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = scanner.nextDouble();

        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Temperature in Celsius: " + celsius );
        System.out.println("\n");
	}
	
	private void areaOfRectangle() {
		System.out.println("Area of a Rectangle");
		System.out.print("\n");
		System.out.println("Alert: Program is not using any particular metric unit \n \n");
		int length, width, area;
		
		System.out.print("What is the length?: ");
		length = scanner.nextInt();
		System.out.print("What is the width?: ");
		width = scanner.nextInt();
		area = length * width;
		System.out.println("Area of the rectangle: " + area);
		System.out.println("\n");
	}
}
