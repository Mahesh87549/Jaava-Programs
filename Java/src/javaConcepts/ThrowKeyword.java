package javaConcepts;

final public class ThrowKeyword {
	
	class CustomizedException extends RuntimeException{

		public CustomizedException(String string) {
			// TODO Auto-generated constructor stub
		}
		
	}
	//function to check if the person is eligible for voting or not
	private void validation(int age) {
		if(age>18)
			System.out.println("Eligible for voting");
		else {
			throw new CustomizedException("Not eligible for voting");
		}
	}
	public static void main(String[] test) {
		ThrowKeyword thk=new ThrowKeyword();
		thk.validation(5);
	}
	

}
