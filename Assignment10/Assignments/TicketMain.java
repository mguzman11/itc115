/*Melissa Guzman
 * ITC 115
 * Assignment 10
 */
package Assignments;
import java.util.*;
public class TicketMain {

	public static void main(String[] args) {
			int type;
			System.out.println("Types of tickets available: ");
			System.out.println("1. Walk-up \n2. Advanced-Student \n3. Advanced-Regular ");
			System.out.println("Ticket number selction: ");
			
			Scanner s= new Scanner(System.in);
			type=s.nextInt();
			
			if (type==1) {
				int num=(int)(Math.random()*1000);
				Ticket wt= new WalkupTicket(num);
				System.out.println(wt);
			}
			
			if (type==2) {
				int num=(int)(Math.random()*1000);
				Ticket ast= new StudentAdvancedTicket(num,11);
				System.out.println(ast);
			}
			
			if (type==3) {
				int num=(int)(Math.random()*1000);
				Ticket atr= new AdvanceTicket(num, 11);
				System.out.println(atr);
			}
			
			s.close();
	}

}
