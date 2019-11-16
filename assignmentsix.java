import java.util.*;
import java.io.*;

/* Melissa Guzman
 * ITC 115
 * Assignment 6
 * November 13, 2019
 */
public class assignmentsix {

	public static void main(String[] args) throws FileNotFoundException {

		boyGirl();

	}

	private static void boyGirl() throws FileNotFoundException {
		int boys = 0;
		int girls = 0;
		int sum1 = 0;
		int sum2 = 0;

		int count = 0;

		Scanner input = new Scanner(new File("boysgirls.txt"));

		while (input.hasNextLine()) {
			System.out.println("This loop has run " + count + " Times");

			if (count % 2 == 0) {
				System.out.println("Melissa");
				System.out.println("The next integer is "+ input.nextInt());
				boys = boys + input.nextInt();
				sum1 = sum1 + input.nextInt();

			} else {
				System.out.println("working2");
				girls++;
				sum2 += input.nextInt();
			}
			count++;
		}
		count += 1;

		System.out.println(boys + " boys" + ", " + girls + " girls");

	}
	
}