/* Program on Super Keyword Illustration: The super keyword refers to the immediate base class
 * To access data members and methods having the same name from base class to derived class
 * super keyword can be used. The super keyword can also be used to call the constructor
 * of base class. Abstract class cannot be intiated.
 * Created by B MAHESH
 * Created on 08.01.2022
 */

package javaConcepts;

public abstract class Super_Key_Word {
	public  void main() {
		System.out.println("I am the Overloaded main method present in the Super Class");
		
	}
	 
	 public static void main(String[] args) {
		 System.out.println("I am in the Parent class");
		 SubClass sc=new SubClass();
		 sc.main();
		 
				
	 }

}
class SubClass extends Super_Key_Word{
public  void main() {
	super.main();
	System.out.println("I am the overloaded main method present in the Child class");
		
	}
	 
	
}
