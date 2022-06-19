/* Program on conditional statements
 * Created by B MAHESH on 18.03.2022
 */
package javaConcepts;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {

		System.out.println("Enter the voter age");
		Scanner scan = new Scanner(System.in);
		double age = scan.nextDouble();
		if (age >= 18) {
			System.out.println(age);
			System.out.println("Candidate eligible for voting");
		} else {
			System.out.println("Candidate is not eligible for voting");
		}

	}

}
