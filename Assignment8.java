/*Melissa Guzman
ITC 115
November 18th, 2019
Assignment 8 A */

package Assignments;

public class Assignment8 {

	public static void main(String[] args) {
		// the isSorted method will return false the array is not sorted and return true if it is sorted.
		//list1=false; list2=true;
		
		
		//test arrays
		double[] list1= {16.1, 12.3, 22.2, 14.4};
		
		double[] list2= {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		
		//passing an array through the method
		isSorted(list1);
	}

	public static void isSorted(double[] arr) {
		
		
	    for(int i = 0; i <= arr.length - 2; i++) {
	    	//System.out.println(i); my debug statement to ensure it is going trough the for statement
	        
	    	if(arr[i + 1] < arr[i]) {
	    		//System.out.println(i); my debug statement to ensure it is going through the if statement
	            
	            System.out.println("false");
	            return;

	    }
	    System.out.println("true");
	    return;
	} 
}	}