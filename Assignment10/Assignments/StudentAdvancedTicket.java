/*Melissa Guzman
 * ITC 115
 * Assignment 10
 */
package Assignments;

public class StudentAdvancedTicket extends AdvanceTicket {

	public StudentAdvancedTicket(int number, int daysInAdvance) {
		super(number, daysInAdvance);
		price=price/2;
	}
	

}
