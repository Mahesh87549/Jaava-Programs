/* Program on acheiving full abstraction using interface concept: Interfaces are similar to Abstract
 * Class but having all the methods of abstract type. Interfaces are the blue print of the class
 * It specify what a Class must do and not how. Since Java 8 we can have default and static methods
 * in an interface.
 * Created by B MAHESH on 09.01.2022
  */


package javaConcepts;

 interface Interface_Key_Word {
	int salary=100000;
	String company_Name="Envision Enterprise Pvt Ltd";
	static void extra_Work() {
		System.out.println("Some times we have to offer additional service");
	}
	
	  void work();
	  public static void main(String[] args) {
		  Test t=new Test();
		  t.work();
		  Interface_Key_Word.extra_Work();
	  }
}
 interface One_More_Interface{
	 	void work(); 
	}
 class Test implements Interface_Key_Word,One_More_Interface {
	    
	 public void work() {
		  System.out.println("iPortman Solution");
	 }
		  
				  }
	