/*Melissa Guzman
 * ITC 115
 * Final
 * December 9, 2019
 */

public abstract class Library {
		
		public int ItemNumber; 
		public String Title;
		public boolean Status;
		public double Fees;
		public String dueDate;
	
	
		public String toString() {
			return "Title "+Title+"Item Number "+ ItemNumber + "Status "+ Status + "Fees Due "+Fees; 
		}
	}
