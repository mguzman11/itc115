/* Melissa Guzman
 * ITC 115
 * Assignment 4
 * October 21, 2019
 */

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		// This program will accept a string and concatenate it a given number of times.
		
		Scanner console= new Scanner(System.in);
		System.out.println("Enter a word or phrase: ");
		
		//string input
		String s1= console.nextLine(); 
		
		//int input
		System.out.println("Enter a number");
		int num1= console.nextInt();
	
		//Call the method
		Repl(s1, num1);
				
	}
		
		//Set up method
		public static String Repl(String s1, int num1) {
			//Initialize variables
			int num2;
			num2=0;
			num2=num1;
				
			//Set up while loop for the number of times it will go through the For loop
			
			//Set up the correct logic
			while (num1>=0 == num2>num1); {
				
				//Set up the For loop to print the string
				for (num1=0;num1<num2;num1++)
					
				//Print the string
				System.out.print(s1);
			}
			return s1;
			
				}
}
				


