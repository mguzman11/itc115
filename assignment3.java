/* Melissa Guzman
 * ITC134 Meredith
 * Assignment3
 * October 13, 2019
 */

public class assignment3 {

	public static void main(String[] args) {
		/*This program will display the number of given powers of a given number
		Test numbers 2^3=8
		
		Call the function*/
		 
		powerOfN(2,3);
		powerOfN(2,7);
		powerOfN(5,3);
		 

	}
		
		//Set up the function
		public static void powerOfN (double base, double exp){
		
			//Initialize variables
			double n1=base; double n2=exp;
			
			Math.pow(n1, n2);
				for ( n1=0; n1<= exp; n1++) {
					System.out.print((int)Math.pow(base, n1) + " ");
				}
			System.out.println();
			
			
		}
		
	}

