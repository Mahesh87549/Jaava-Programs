/* First Program on Java
 * Created by B MAHESH
 * Created on 08.01.2022
 */


package javaConcepts;


class Employee {
	static String name;
	static int Emplye_Id;
	
	public Employee(String name, int Emplye_Id){
		this.name=name;
		this.Emplye_Id=Emplye_Id;
		
	}
	
	public static void main(String[] args) {
		Employee emp=new Employee("Mahesh", 1287);
		Employee emp1=new Employee("RAKESH", 1288);
		System.out.println(name+"   " + Emplye_Id);
		Constructor_Example ce=new Constructor_Example();
		ce.display();
				
	}
}
