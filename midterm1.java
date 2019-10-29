/*Melissa Guzman and Minh Ngu
 * ITC 115
 * Midterm 
 * October 28, 2019
 */
import java.util.Scanner;

public class midterm1 {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		System.out.println("Enter a card: ");
		
		String name = console.next();
		String number = console.next();

		card(name,number);

	}

	public static void card(String name, String number) {

		if (name.equals("2")) {
			name = "Two";
		} else if (name.equals("3")) {
			name = "Three";
		} else if (name.equals("4")) {
			name = "Four";
		} else if (name.equals("5")) {
			name = "Five";
		} else if (name.equals("6")) {
			name = "Six";
		} else if (name.equals("7")) {
			name = "Seven";
		} else if (name.equals("8")) {
			name = "Eight";
		} else if (name.equals("9")) {
			name = "Nine";
		} else if (name.equals("10")) {
			name = "Ten";
		} else if (name.equals("J")) {
			name = "Jack";
		} else if (name.equals("Q")) {
			name = "Queen";
		} else if (name.equals("A")) {
			name = "Ace";
		} else {
			name = "King";
		}
		if (number.equals("S")) {
			number = "Spades";
		} else if (number.equals("C")) {
			number = "Clubs";
		} else if (number.equals("D")) {
			number = "Diamonds";
		} else {
			number = "Hearts";

		}
		System.out.print(name + " of "+ number);
	}
	
}
