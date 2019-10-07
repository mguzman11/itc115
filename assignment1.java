/* Melissa Guzman
 * ITC134 Meredith
 * Assignment2
 * October 7, 2019
 */


public class assignment1 {

	public static void main(String args[]) 
	{    
		
	//This program runs the first 12 Fibonacci sequence numbers
		
	/*Initialize variables. Account for 0 and 1 in the sequence. 
	 * 
	 * Test number= 12th number is 89. 
	 */
		
	 int n1=0,n2=1,n3,i;  
	 
	 //Print out the first 3 numbers in the sequence
	 System.out.print(n1+" "+n2); 
	    
	 //begin the loop with 2 and go until it is at the 12th number in the sequence
	 for(i=2;i<12;++i){    
	  n3=n1+n2; 
	  
	  System.out.print(" "+n3);  
	  
	  //set up the formula
	  n1=n2;  
	  
	  n2=n3;    
	 }    
	  
	}
}