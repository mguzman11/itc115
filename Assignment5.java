/* Melissa Guzman
 * ITC 115
 * Assignment 5
 * Ava Meredith
 * October 28,2019
 */

import java.util.*;
public class Assignment5 {

	public static void main(String[] args) {
		//These programs return a season for a given date in integers and calculates a GPA
		
		//Season Method
		Scanner console= new Scanner(System.in);
		System.out.println("Enter a month using 2 digits: ");
		
		//month input using int
		int Month= console.nextInt(); 
		
		//day input using int
		System.out.println("Enter a day using 2 digits");
		int Day= console.nextInt();
	
		//Call the Season method
		Season(Month, Day);
		

	}
	//Set up the method for season
	public static void Season ( int Month, int Day) {
		//Logic for Winter
		if (Month >=01 && Month<=03) {
			if (Month== 3 && Day>= 16) {
			 System.out.println("Spring");
			 }
			 else { System.out.println ("Winter");
			 
			}
		}
		//Logic for Spring
		if (Month >=04 && Month<=06) {
			if (Month== 6 && Day>= 16) {
			 System.out.println("Summer");
			 }
			 else { System.out.println ("Spring");
			 
			}
		}
		//Logic for Summer
		if (Month >=07 && Month<= 9) {
			if (Month== 9 && Day>= 16) {
			 System.out.println("Fall");
			 }
			 else { System.out.println ("Summer");
			 
			}
		}
		//Logic for Fall
		if (Month >=10 && Month<=12) {
			if (Month== 12 && Day>= 16) {
			 System.out.println("Winter");
			 }
			 else { System.out.println ("Fall");
			 
			}
		}
		
		//This GPA calculator assumes no negative scores can be used and that the highest scores is 100.. 
		Scanner console= new Scanner (System.in);
		
		//Get name from user
		System.out.println("Enter Student's name: ");
		String name1= console.next();
		String student=name1;
		int scores=0;
		
		
		//Call the GPA method
		printGPA(name1,scores);
		
	
}

	public static void printGPA (String name1, int scores) {
		String student=name1;
		
		
		Scanner console= new Scanner (System.in);
		System.out.println("Enter scores: ");
		int i;
		
		
		while(scores==console.nextInt()) {
			
			
			i = console.nextInt();
			int sum = 0;
			int count = 0;
			sum = sum + i;
			count++;
			int avg= sum/count;
		    
		    
		}
		System.out.print(student + " grade is "+ avg);
		
		}
}