package javaConcepts;

public class Constructor_Example_2 {
	int Employee_ID;
	String name;
	Constructor_Example_2(String name, int num){
		this.Employee_ID=num;
		this.name=name;
		 
		
	}
	
	public static void main(String args[]) {
		Constructor_Example_2 ce=new Constructor_Example_2("MAHESH", 101);
		Constructor_Example_2 ec=new Constructor_Example_2("RAKESH", 102);
		System.out.println("Employee 1 Details: "+ ce.name+" "+ce.Employee_ID+" ");
		System.out.println("Employee 2 Details: "+ ec.name+" "+ec.Employee_ID+" ");
		
	}

}
