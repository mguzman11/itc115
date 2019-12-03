/*Melissa Guzman
 * ITC 115
 * Assignment 10
 */
package Assignments;

public class AdvanceTicket extends Ticket {

	public AdvanceTicket(int number, int daysInAdvance) {
		super(number);
		
		if (daysInAdvance<=10) {
			price =40;
		}
		
		else {
			price=30;
		}
	}
	

}
