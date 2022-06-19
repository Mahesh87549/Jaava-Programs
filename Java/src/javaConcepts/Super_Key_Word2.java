/* Program on Super Keyword Illustration: The super keyword refers to the immediate base class
 * To access data members and methods having the same name from base class to derived class
 * super keyword can be used. The super keyword can also be used to call the constructor
 * of base class. Abstract class cannot be intiated.
 * Created by B MAHESH on 11.01.2022
 */

package javaConcepts;

public abstract class Super_Key_Word2 {
	int num1;;
	public  void main(int num1) {
		System.out.println(this.num1=num1);
		
		
	}
	 
	 public static void main(String[] args) {
		 System.out.println("I am in the Parent class");
		 Exam sc=new Exam();
		 sc.main(10);
			
	 }

}
class Exam extends Super_Key_Word2{
public  void main(int num1) {
	super.main(20);
	System.out.println(num1);
	}
}
