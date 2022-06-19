/* Program on Polymorphism
 * Created by B MAHESH
 * Created on 08.01.2022
 * In Java, Polymorphism achieved with the help of Methods.
 * Polymorphism of two types: Compile time Polymorphims and Run time Polymorphism. Compile time polymorphism can be achieved with Method Overloading.
 Conditions for Method Overloading: 1) Class should be same 2) Method Name should be same 3) Having different set of arguments
 * 
 * 
 */

package javaConcepts;

public final class Polymorphism_Example {

	void Example(int num) {
		System.out.println("Comile time polymorphism is achieved");

	}

	void Example(String name) {
		System.out.println("Comile time polymorphism is achieved1");

	}

	void Example(boolean name) {
		System.out.println("Comile time polymorphism is achieved2");

	}

	public static void main(String[] args) {
		Polymorphism_Example pe = new Polymorphism_Example();
		pe.Example(2);
		pe.Example(true);
		pe.Example("Mahesh");
	}

}
