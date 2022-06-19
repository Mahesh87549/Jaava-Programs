/* Program on Inheritance
 * Created by B MAHESH
 * Created on 08.01.2022 
 Inheritance is the property by which all the parent class properties acquired by the child class
 Whenever Inheritance is created between parent class and child class"IS-A" relationship is created
 between them.
  */
 package javaConcepts;

class Inheritance_Example {
	
		String name; 
		int price;
	 	void run() {
			System.out.println("It will run fast");
			
		}
	 	public static void main(String[] args) {
			Dog dg=new Dog();
			dg.run();
			
		}
					
	}
class Dog extends Inheritance_Example{
	void run() {
		System.out.println("I am the fastest runner");
		
	}
	
	
}


