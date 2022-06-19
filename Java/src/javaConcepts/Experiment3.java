/* Program on Interview Question
 * Created by B MAHESH
 * Created on 0.01.2022
 */

package javaConcepts;

public class Experiment3 {
	void show() {
		System.out.println("I am in the parent Class");
			}
	public static void main(String[] args) {
		Experiment3 ef=new Experiment3();
		ef.show();
		Experiment4 gh=new Experiment4();
		gh.show();
		gh.show();
		Experiment3 ij=new Experiment4();
		ij.show();
		
		
	}

}
class Experiment4 extends Experiment3{
	void show() {
		System.out.println("I am in the Child Class");
	}
}
