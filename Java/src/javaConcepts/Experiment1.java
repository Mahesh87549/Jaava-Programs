/* Program on Interview Question
 * Created by B MAHESH
 * Created on 0.01.2022
 */

package javaConcepts;

public class Experiment1 {
	void show() {
		System.out.println("I am in the parent Class");
			}
	public static void main(String[] args) {
		Experiment1 ef=new Experiment1();
		ef.show();
		Experiment2 gh=new Experiment2();
		gh.show();
		gh.show1();
		Experiment1 ij=new Experiment2();
		ij.show();
		
		
	}

}
class Experiment2 extends Experiment1{
	void show1() {
		System.out.println("I am in the Child Class");
	}
}
