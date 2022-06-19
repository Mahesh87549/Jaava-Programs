/* Program on static Key word: Static keyword is non-access modifier. Static keyword only be used with class level variable
 * Static keyword can be used with method, block and inner class.Static keyword cannot be
 * used with local variable. Static variable belongs to the class and then can be 
 * invoked with class name. Static variables are used for memory managment.The static variable can be used
 * to refer to the common property or value for all objects.Static variables are stored under
 * method area/Class Area and Objects are created under Heap Area. Reference variables are stored under Stack Memory.
 * Speed will be improved by using static variables.
 */


package javaConcepts;

public class Static_Key_Word {
	int emp_ID;
	static String companyname="Envision"; 
	String name;
	Static_Key_Word(int num1, String name)
	{
		emp_ID=num1;
		this.name=name;
	}
	void dispaly() {
		System.out.println(emp_ID+("   "+companyname)+("   "+ name));
	}
	public static void main(String args[])
	{
		Static_Key_Word ex=new Static_Key_Word(101,"MAHESH");
		ex.dispaly();
		Static_Key_Word ex2=new Static_Key_Word(102,"RAKESH");
		ex2.dispaly();
		
	}
		

}


