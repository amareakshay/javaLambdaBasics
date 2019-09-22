package com.lambdaExamples2;

public class ClosureExample {
	public static void main(String[] args) {
		int a =10;
		int b=20;
		/*here java will freeze the value of b in order to execute process method 
		 * i.e to print i+b hence b will be treated as final here
		 * as its frozen value will be passed across from the call below to the 
		 * doProcess function where it will actually be executed
		 * so even if b changes at some point later to say 40 and the function doProcess is called
		 * later in time; it will still consider the value of b as 20 as it was frozen and passed
		 * across
		 */
		doProcess(a,(i)-> System.out.println(i+b));
	}
	
	public static void doProcess(int i,Process p) {
		p.process(i);
	}

}

interface Process{
	void process(int i);
}