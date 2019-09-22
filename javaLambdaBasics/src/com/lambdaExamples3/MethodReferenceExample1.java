package com.lambdaExamples3;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		Thread t = new Thread(()-> printMessage());
		t.run();
		//* Using Method References
		Thread t2 = new Thread(MethodReferenceExample1::printMessage);
		t2.run();

	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}

}
