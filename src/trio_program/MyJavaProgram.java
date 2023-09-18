package trio_program;
import java.util.Scanner;

public class MyJavaProgram {


	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int answer, sequential, selection, iteration, again;
		
		boolean nn1 = true;
		boolean nn2=true;
		boolean nn3 = true;
		boolean s1 = true;
		boolean s2=true;
		boolean s3 = true;
		boolean t1 = true;
		boolean t2=true;
		boolean t3=true;
		boolean casewan = true;
		boolean casetu = true;
		boolean casetri = true;
		int iterationlastchoice; 
		int sequentiallasatchoice;
		int selectionlasatchoice;
		
		do 
		{
			do 
			{
				if ((casewan == true)&&(casetu == true)&&(casetri ==true))
				{
					System.out.print("Java Programming Structure \n 1. Sequential\n 2. Selection \n 3. Iteration \n \n Choose the structure you want: ");
				}
				else if ((casewan == false)&&(casetu == true)&&(casetri == true))
				{
					System.out.print("Java Programming Structure \n 1. Sequential*\n 2. Selection \n 3. Iteration \n \n Choose the structure you want: ");
				}
				else if ((casewan == true)&&(casetu == false)&&(casetri == true))
				{
					System.out.print("Java Programming Structure \n 1. Sequential\n 2. Selection* \n 3. Iteration \n \n Choose the structure you want: ");
				}
				else if ((casewan == true)&&(casetu == true)&&(casetri == false))
				{
					System.out.print("Java Programming Structure \n 1. Sequential\n 2. Selection \n 3. Iteration* \n \n Choose the structure you want: ");
				}
				else if ((casewan == false)&&(casetu == false)&&(casetri == true))
				{
					System.out.print("Java Programming Structure \n 1. Sequential*\n 2. Selection* \n 3. Iteration \n \n Choose the structure you want: ");
				}
				else if ((casewan == true)&&(casetu == false)&&(casetri == false))
				{
					System.out.print("Java Programming Structure \n 1. Sequential\n 2. Selection* \n 3. Iteration* \n \n Choose the structure you want: ");
				}
				else if ((casewan == false)&&(casetu == true)&&(casetri == false))
				{
					System.out.print("Java Programming Structure \n 1. Sequential*\n 2. Selection \n 3. Iteration* \n \n Choose the structure you want: ");
				}
				else if ((casewan == false)&&(casetu == false)&&(casetri == false))
				{
					System.out.print("Java Programming Structure \n 1. Sequential*\n 2. Selection* \n 3. Iteration* \n \n Choose the structure you want: ");
				}
				answer = cin.nextInt();
				
				
				
				if((answer != 1) && (answer != 2) && (answer != 3))
				{
					System.out.print("Please input a number between 1-3 \n");
				}
			}while((answer!= 1) && (answer!= 2) && (answer!= 3));
			
			switch(answer)
			{
				case 1:
					do
					{
					do {		
						if((nn1 == true) && (nn2 == true) && (nn3 == true) )
							{
							System.out.print("\nSequential Statement:  \n\n1) Calculation the area of the rectangle\n\n2) Covert Fahrenheit to Celcius\n\n3) Compute Area, circumference and diameter of a circle \n \n Choose the structure you want:");
							}
							else if ((nn1 == false) && (nn2 == true) && (nn3 == true))
								{
								System.out.print("\nSequential Statement: \n\n1) Calculation the area of the rectangle*\n\n2) Covert Fahrenheit to Celcius\n\n3) Compute Area, circumference and diameter of a circle \n \n Choose the structure you want:");
								}
									else if ((nn1 == true) && (nn2 == false) && (nn3 == true))
										{
										System.out.print("\nSequential Statement: \n\n1) Calculation the area of the rectangle\n\n2) Covert Fahrenheit to Celcius*\n\n3) Compute Area, circumference and diameter of a circle \n \n Choose the structure you want:");
										}
											else if ((nn1 == true) && (nn2 == true) && (nn3 == false))
												{
												System.out.print("\nSequential Statement: \n\n1) Calculation the area of the rectangle\n\n2) Covert Fahrenheit to Celcius\n\n3) Compute Area, circumference and diameter of a circle* \n \n Choose the structure you want:");
												}
													else if ((nn1 == false) && (nn2 == false) && (nn3 == true))
														{
														System.out.print("\nSequential Statement: \n\n1) Calculation the area of the rectangle*\n\n2) Covert Fahrenheit to Celcius*\n\n3) Compute Area, circumference and diameter of a circle \n \n Choose the structure you want:");
														}
															else if ((nn1 == false) && (nn2 == true) && (nn3 == false))
																{
																System.out.print("\nSequential Statement: \n\n1) Calculation the area of the rectangle*\n\n2) Covert Fahrenheit to Celcius\n\n3) Compute Area, circumference and diameter of a circle* \n \n Choose the structure you want:");
																}
																	else if ((nn1 == true) && (nn2 == false) && (nn3 == false))
																		{
																		System.out.print("\nSequential Statement: \n\n1) Calculation the area of the rectangle\n\n2) Covert Fahrenheit to Celcius*\n\n3) Compute Area, circumference and diameter of a circle* \n \n Choose the structure you want:");
																		}
																			else if ((nn1 == false) && (nn2 == false) && (nn3 == false))
																				{
																				System.out.print("\nSequential Statement: \n\n1) Calculation the area of the rectangle*\n\n2) Covert Fahrenheit to Celcius*\n\n3) Compute Area, circumference and diameter of a circle* \n \n Choose the structure you want:"); 
																				}
						sequential = cin.nextInt();
						
						
						if((sequential!= 1) && (sequential!= 2) && (sequential!= 3))System.out.print("\nPlease input a number between 1-3 \n");
						
					}while((sequential!= 1) && (sequential!= 2) && (sequential!= 3));
						switch(sequential) {
						case 1:
							nn1 = false;
							System.out.println("\n\n1) Calculation the area of the rectangle");
							System.out.print("Enter the length: ");
							int length = cin.nextInt();
							
							System.out.print("Enter the Width: ");
							int Width = cin.nextInt();
							
							System.out.println("The area of the rectangle is " + (length * Width ));
							break;
							
						case 2:
							nn2 = false;
							System.out.println("\n\n2) Convert Fahrenheit to Celcius");
							System.out.print("Enter the temperature in Fahrenheit: ");
							double fahrenheit = cin.nextDouble();
							double resultsequential2 = (fahrenheit-32)/1.8;
							System.out.printf("The temperature in Celcius: %.2f",  resultsequential2 );
							
							break;
							
						case 3:
							nn3 = false;
							System.out.println("\n\nCompute Area, circumference and diameter of a circle");
							
							System.out.print("Enter the radius of the circle: ");
							double radius = cin.nextDouble();
							
							
							System.out.println("\nFor the diameter of the circle:");
							System.out.println("Diameter = Two times of the radius.\nSo,\nDiameter = radius * 2\nDiameter = "+ (radius* 2) );
							
							System.out.println("\nFor the area of the circle:");
							System.out.println("Area = Pie multiply to the radius of square.\nSo,\nArea = (pie=3.14159)*Radius^2\nArea = " + (3.14159 * (Math.pow(radius, 2))));
							System.out.println("\nFor the circumference of the circle:");
							System.out.println("Circumference = two multiply to pie and multiply again to radius.\nSo,\nCircumference = 2 * (pie=3.14159) * radius\nCircumference = " + (2*3.14159*radius));
							break;
						}
						if((nn1 == true)|| (nn2 == true) || (nn3 == true))
						{
							System.out.print("\nGo to sequencial(1)\nGo to exit(any key)");
							sequentiallasatchoice = cin.nextInt();
							
						}
						else
						{
							System.out.print("\nNote: You have checked the sequential problems.\nNote: Redirect to exit menu.");
							sequentiallasatchoice = 0;
						}
						if((nn1 == false)&& (nn2 == false) && (nn3 == false)) 
							{
							casewan = false;
							}
					}
					while(sequentiallasatchoice == 1);
					break;
					
				case 2:
					do
					{
						do {
							if((s1 == true) && (s2 == true) && (s3 == true) )
								{
								System.out.print("\nSelection Statement: \n\n1) Determine odd or even\n\n2) Determine a year is leap year or not\n\n3) Shipping cost \n \n Choose the structure you want:");
								}
								else if ((s1 == false) && (s2 == true) && (s3 == true))
									{
									System.out.print("\nSelection Statement: \n\n1) Determine odd or even*\n\n2) Determine a year is leap year or not\n\n3) Shipping cost \n \n Choose the structure you want:");
									}
										else if ((s1 == true) && (s2 == false) && (s3 == true))
											{
											System.out.print("\nSelection Statement: \n\n1) Determine odd or even\n\n2) Determine a year is leap year or not*\n\n3) Shipping cost \n \n Choose the structure you want:");
											}
												else if ((s1 == true) && (s2 == true) && (s3 == false))
													{
													System.out.print("\nSelection Statement: \n\n1) Determine odd or even\n\n2) Determine a year is leap year or not\n\n3) Shipping cost* \n \n Choose the structure you want:");
													}
														else if ((s1 == false) && (s2 == false) && (s3 == true)) 
														{
															System.out.print("\nSelection Statement: \n\n1) Determine odd or even*\n\n2) Determine a year is leap year or not*\n\n3) Shipping cost \n \n Choose the structure you want:");
														}
																else if ((s1 == false) && (s2 == true) && (s3 == false))
																	{
																	System.out.print("\nSelection Statement: \n\n1) Determine odd or even*\n\n2) Determine a year is leap year or not\n\n3) Shipping cost* \n \n Choose the structure you want:");
																	}
																		else if ((s1 == true) && (s2 == false) && (s3 == false))
																			{
																			System.out.print("\nSelection Statement: \n\n1) Determine odd or even\n\n2) Determine a year is leap year or not*\n\n3) Shipping cost* \n \n Choose the structure you want:");
																			}
																				else if ((s1 == false) && (s2 == false) && (s3 == false))
																					{
																					System.out.print("\nSelection Statement: \n\n1) Determine odd or even*\n\n2) Determine a year is leap year or not*\n\n3) Shipping cost* \n \n Choose the structure you want:");
																				
																					}
							
							
							selection = cin.nextInt();
							
							
							if((selection!= 1) && (selection!= 2) && (selection!= 3)) System.out.print("\nPlease input a number between 1-3 \n");
							
						}while((selection!= 1) && (selection!= 2) && (selection!= 3));
						
							switch(selection) {
							case 1:
								s1 = false;
								System.out.println("\n\n1) Determine odd or even");
								System.out.println("Give a number: ");
								int selection1 = cin.nextInt();
								
								if (selection1 % 2 == 0) {
									System.out.println(selection1 + " is an even number.");
								} else {
									System.out.println(selection1 + " is an odd number.");
								}
								
								break;
							case 2:
								s2 = false;
								System.out.println("\n\n2) Determine a year if a leap year or not");
								System.out.print("Give a year: ");
								int selection2 = cin.nextInt();
								
								if ((selection2 % 100 != 0) || (selection2 % 400 == 0) &&(selection2 % 4 == 0)  ) {
									System.out.println(selection2 + " is a leap year.");
								} else {
									System.out.println(selection2 + " is not a leap year.");
								}
								break;
							case 3:
								s3 = false;
								System.out.println("\n\n3) Shipping cost");
								System.out.print("Enter the weight of the package(In pounds): ");
								int selection3 = cin.nextInt();
								
								if(selection3 <= 10) {
									System.out.println("The cost of the shipment is Php 250.00");
								}else {
									System.out.println("The cost of the shipment is Php 400.00");
								}
								break;
							}
							if((s1 == true)|| (s2 == true) || (s3 == true))
							{
								System.out.print("\nGo to selection(1)\nGo to exit(any key)");
								selectionlasatchoice = cin.nextInt();
								
							}
							else
							{
								System.out.print("\nNote: You have checked the iteration problems.\nNote: Redirect to exit menu.");
								selectionlasatchoice = 0;
							}
							if((s1 == false)&& (s2 == false) && (s3 == false)) 
								{
								casetu = false;	
								}
					} while(selectionlasatchoice ==1);
					break;
				case 3:
					do 
					{
						
					
						do {
							if((t1 == true) && (t2 == true) && (t3 == true) )
								{
								System.out.print("\nIteration Statement: \n\n1) First 10 Fibonacci numbers\n\n2) ATM simulation\n\n3) Multiplication Table of a given number\n \n Choose the structure you want:");
								}
								else if ((t1 == false) && (t2 == true) && (t3 == true))
									{
									System.out.print("\nIteration Statement: \n\n1) First 10 Fibonacci numbers*\n\n2) ATM simulation\n\n3) Multiplication Table of a given number\n \n Choose the structure you want:");
									}
										else if ((t1 == true) && (t2 == false) && (t3 == true))
											{
											System.out.print("\nIteration Statement: \n\n1) First 10 Fibonacci numbers\n\n2) ATM simulation*\n\n3) Multiplication Table of a given number\n \n Choose the structure you want:");
											}
												else if ((t1 == true) && (t2 == true) && (t3 == false))
													{
													System.out.print("\nIteration Statement: \n\n1) First 10 Fibonacci numbers\n\n2) ATM simulation\n\n3) Multiplication Table of a given number*\n \n Choose the structure you want:");
													}
														else if ((t1 == false) && (t2 == false) && (t3 == true))
															{
															System.out.print("\nIteration Statement: \n\n1) First 10 Fibonacci numbers*\n\n2) ATM simulation*\n\n3) Multiplication Table of a given number\n \n Choose the structure you want:");
															}
																else if ((t1 == false) && (t2 == true) && (t3 == false))
																	{
																	System.out.print("\nIteration Statement: \n\n1) First 10 Fibonacci numbers\n\n2) ATM simulation\n\n3) Multiplication Table of a given number\n \n Choose the structure you want:");
																	}
																		else if ((t1 == true) && (t2 == false) && (t3 == false))
																			{
																			System.out.print("\nIteration Statement: \n\n1) First 10 Fibonacci numbers\n\n2) ATM simulation*\n\n3) Multiplication Table of a given number*\n \n Choose the structure you want:");
																			}
																				else if ((t1 == false) && (t2 == false) && (t3 == false))
																					{
																					System.out.print("\nIteration Statement: \n\n1) First 10 Fibonacci numbers*\n\n2) ATM simulation*\n\n3) Multiplication Table of a given number*\n \n Choose the structure you want:");
																					}
							iteration = cin.nextInt();
							
							
							if((iteration!= 1) && (iteration!= 2) && (iteration!= 3) ) System.out.print("\nPlease input a number between 1-3 \n");
						}while((iteration!= 1) && (iteration!= 2) && (iteration!= 3) );
						
							switch(iteration) {
							case 1:
								t1 = false;
								System.out.println("\n\n1) First 10 Fibonacci numbers");
								int n2 = 1;
								int n1 = 0;
								int result= 0;
								int fn1 = n1;
								int fn2 = n2;
								
							for (int fn = 1; fn<10; fn++)
								{
									result = fn1 + fn2;
									fn1 = fn2;
									fn2 = result;
									System.out.print( result + "\t");
								}
								break;
							case 2:
								t2 = false;
								System.out.println("\n\n2) ATM simulation");
								
								System.out.print("Enter the initial balance:\t\tPHP ");
								double iteration2 = cin.nextDouble();
								
								boolean atm = true;
									while((iteration2 >= 1) && (atm == true))
								{
									System.out.print("Enter how much you want to withdraw:\tPHP ");
									double withdraw = cin.nextDouble();
									
									if((iteration2 >= withdraw))
									{
										 atm = true;
										if (withdraw >= 0)
										{
											iteration2 = iteration2 - withdraw;
											System.out.println("The account balance is:\t\t\tPHP " + iteration2);
										}
										else 
										{
											System.out.println("You enter a negative number\nPlease enter again.\n");
											System.out.println("The account balance is:\t\t\tPHP " + iteration2);
										}
									}
									else
									{
										if(withdraw >= iteration2)
										{
											atm = true;
											System.out.println("Your balance is low.\nPlease enter again.\n");
											System.out.println("The account balance is:\t\t\tPHP " + iteration2);
										}
										else
										{
											atm = false;
										}
									}
								}
								break;
								
							case 3:
								t3 = false;
								System.out.println("\n\n3) Multiplication Table of a given number: \n");
								double iteration3;
								
								System.out.print("Enter a number to generate a multiplication table:");
								iteration3 = cin.nextDouble();
								
								for(int i=1; i <=10; i++)
								{
									System.out.print(i + "\t*\t" + iteration3 + "\t=\t" + (iteration3 * i) + "\n");
								}
								break;
							}
							if((t1 == true)|| (t2 == true) || (t3 == true))
							{
								System.out.print("\nGo to iteration(1)\nGo to exit(any key)");
								iterationlastchoice = cin.nextInt();
							}
							else
							{
								System.out.print("\nNote: You have checked the iteration problems.\nNote: Redirect to exit menu.");
								iterationlastchoice = 0;
							}
							if((t1 == false)&& (t2 == false) && (t3 == false)) 
								{
								casetri = false;	
								}
					}while(iterationlastchoice == 1);
					break;
			}
			System.out.print("\nDo you want to solve again?(YES for 1)");
			again = cin.nextInt();
		}while(again == 1);
		cin.close();
	}

}
