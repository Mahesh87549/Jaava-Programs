/* Program on Abstract keyword; A method which is having definition or body and do not end with semicolon
 * that method is known as non-abstract method. Class is the collection of variables/fields and non-abstract methods
 * If abstract methods are present in a class, It will give a compile time error. Abstract method must follow with abstract
 * modifier(Keyword). A class which is a collection of both non-abstract methods and atleast one abstract method 
 * is known as abstract class. Abstract method cannot be private and final.For abstract class we cannot 
 * create objects.
 * Created by B MAAHESH
 * Created on 08.01.2022
 */


package javaConcepts;

public abstract class Abstract_Key_Word  {
	
	abstract void show();
	//public static void main() {
		//System.out.println("I am in the override main method");
	//}
	public static void main(String args[] ) {
		Imp tt=new Imp();
		tt.show();
		System.out.println("I am in the main method");
		
	}
	   
	

}
class Imp extends Abstract_Key_Word{
	void show() {
		System.out.println("I was given specific implementation");
		
	}
}
