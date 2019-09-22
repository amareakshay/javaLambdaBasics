package com.lambdaExamples;

public class Greeter {
	
	public void greet(Greeting g) {
		g.perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		HelloWorldGreeting helloworld = new HelloWorldGreeting();
		greeter.greet(helloworld);
		
		Greeting myLambda= () -> System.out.println("My Lambda Hello World Greeting");
		
		greeter.greet(myLambda);
		
		//* Lambda implementation 2 via type inference
		//* Here we are telling greet to use the lambda expression passed as Greeting interface
		//* As greet() method takes in an argument of type Greeting interface
		
		greeter.greet(() -> System.out.println("My Lambda Hello World Greeting in arg"));

	}

}
