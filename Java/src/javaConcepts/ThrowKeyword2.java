/*Program on Throw Keyword.
 * Created by B Mahesh on 22.05.2022
 * Using Throw keyword we can either throw Checked Exceptions or Unchecked Exceptions. Except subclasses of RunTimeException and error all are checked Exceptions only.
 */


package javaConcepts;

public class ThrowKeyword2 {
	
	//Method to validate Voter age
	void validate(int age) {
		if(age<18)
			throw new ArithmeticException("You are not eligible for voting");
		else
			System.out.println("Cast your vote and save democracy");
		
	}
	public static void main(String[] args) {
		ThrowKeyword2 throwKeyword2=new ThrowKeyword2();
		throwKeyword2.validate(17);
	}
	
	
	

}
