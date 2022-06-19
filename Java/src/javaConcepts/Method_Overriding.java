/* Program on Method overriding
 * Created by B MAHESH
 * Created on 08.01.2022
 * Runtime Polymorphism can be achieved with the help of Method Overriding.
 *Characterstics of Method Overriding: 1) Method name must be same and type of arguments also must be same
 *Two method must be in two different classes and there is must be IS-A relationship
 */

package javaConcepts;

class Method_Overriding {

	protected void parentMethod() {
		System.out.println("I am in the Parent Method");

	}

	public static void main(String[] args) {
		Method_Overriding2 or = new Method_Overriding2();
		or.parentMethod();
	}

    }

class Method_Overriding2 extends Method_Overriding {
	protected void parentMethod() {
		System.out.println("I am in the Child Mehod");

	}

}
