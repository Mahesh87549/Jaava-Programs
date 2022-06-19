/* Program on Encapsulation: Encapsulation in java is a mechanism of wrapping the data(variables)
 * and code acting on the data(methods) to gether as a single unit. Steps to achieve Encapsulation:
 * 1) Declare the variables of a class as private
 * 2) Provide public setter and getter methods to modify and view the variable values.
 */

package javaConcepts;

public class Encapsulation {
	public static void main(String[] args) {
		Practise T=new Practise();
		T.setFields(9014353, "MAHESH");
		T.getFields();
	}
	

}
class Practise{
	private double phoneNumber;
	private String name;
	public  void setFields(double phoneNumber, String name) {
		this.phoneNumber=phoneNumber;
		this.name=name;
	}
	public  void getFields() {
		//Test En=new Test();
		System.out.println(phoneNumber);
		System.out.println(name);
	}
	
}
