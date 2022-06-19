/* Program on the concept of objects
 * Created by B MAHESH
 * Created on 11.01.2022
 */

package javaConcepts;

public class Experiment7 {
	int emp_ID;
	static String companyname = "Envision";
	String name;

	Experiment7(int num1, String name) {
		emp_ID = num1;
		this.name = name;
	}

	void dispaly() {
		System.out.println(emp_ID + ("   " + companyname) + ("   " + name));
	}

	public static void main(String args[]) {
		Experiment7 ex = new Experiment7(101, "MAHESH");
		ex.dispaly();
		Experiment7 ex2 = new Experiment7(102, "RAKESH");
		ex2.dispaly();

	}

}
