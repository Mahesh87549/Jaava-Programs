package javaConcepts;



class Multiple_Inheritance_Concept{
	public static void main(String args[]) {
		Master m=new Master();
		m.red();
		m.height();
		
		
	}
}

interface Color {
	void red();

}
interface Length{
	void  red();
	
}
class Fly{
	void height(){
		System.out.println("It can fly to any Extent");
	}
	
	
}
class Master extends Fly implements Length, Color{

	@Override
	public void red() {
		System.out.println("Color is red");
		
	}

	
}

