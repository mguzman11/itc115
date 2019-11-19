/*Melissa Guzman
ITC 115
November 18th, 2019
Assignment 8 B */

package Assignments;
import java.util.Arrays;

public class Assignment8b {

	public static void main(String[] args) {
		// The isUnique method will take a number (named variable as key) and will determine if it is in a given array
		 
			//test arrays. key of 99 will return false.	  
			int [] list1= {5, 8, 10, 4, 2, 1, 9, 0};
			int [] list2= {8, 11, 4, 33, 9, 7, 10, 6, 8};
			
			//Sort the given array
			Arrays.sort(list1);
			//System.out.println(Arrays.toString(list1)); debugging statement to be sure the array sorts
			
			//key may be changed to any number you wish;
			int key= 99;
			
			isUnique(list1, key);
	}
		
		public static void isUnique(int [] arr, int key) {
			
			// Runs the a binary search of the elements in the array		
			int numSer= Arrays.binarySearch(arr, key);
			
			//System.out.println(numSer); debugging statement to see the value returned by the binarySearch()
			
			
			//saving the result to a simpler variable
			int i = numSer;
			
			//declares when the results is true or false based on the search result of numSer
			if (i+1 <= 0) {
				System.out.println("false");
				
			}else {
					System.out.println("true");
				}

}
}