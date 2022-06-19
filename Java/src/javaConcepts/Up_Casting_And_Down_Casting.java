/*Program on Up casting and Down casting Created by B MAHESH on 08.05.2022
 * When we create on object of a class and store it or assign it a reference of it's super class or interface then it is called Up casting. We cannot do reverse.
 * 
 */

package javaConcepts;

public abstract class Up_Casting_And_Down_Casting {
	int num1;
	String comapny_Name;

	public void method1() {
		System.out.println("I am in the method1");
	}

	public static void main(String args[]) {
		// Up Casting Example
		Up_Casting_And_Down_Casting upCastingAndDownCasting = new One();
		upCastingAndDownCasting.method1();

		// Down Casting Example
		One one = (One) upCastingAndDownCasting;
		one.method2();
		
	}
}

class One extends Up_Casting_And_Down_Casting {

	public void method2() {
		System.out.println("I am in the method2");
		
	}

}
