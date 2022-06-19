/* Program on Abstraction: Abstraction is hiding implementation details and just offering services.
 * Real time example of Abstraction is, we know how breaks works but it's implementation details we don't know
 * Abstraction can be achieved by Abstract class and Interface(100% abstraction). If a regular class extends
 * an abstract class then the class must have to implement all the abstract methods of abstract parent class
 * or it has to be declared abstract as well.
 * Created BY B MAHESH
 * Created on 08.01.2022
 */

package javaConcepts;

abstract  class Abstraction_Key_Word {
	int numberOfWheels;
	double price;
	abstract void start();
	
	public static void main(String[] args) {
		 Bike bb=new Bike();
				 bb.start();
	 }
	}
 class Bike extends Abstraction_Key_Word{
	
	 int numberOfWheels=2;
	 double price=150000;
	 void start() {
		 System.out.println("It will start with key");
	
	 }
	 
 }
