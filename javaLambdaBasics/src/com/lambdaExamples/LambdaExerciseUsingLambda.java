package com.lambdaExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExerciseUsingLambda {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				  new Person("Akshay","Amare",29),
				  new Person("Arun","Amare",63),
				  new Person("Seema","Amare",55),
				  new Person("Prachi","Amberkar",33),
				  new Person("Test","Ceylon",33)
				);
		
		//* Sort List by Last name
		
		Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		//* Print all the elements in that list 
		printAll(people);
		System.out.println("################################");
		printConditionally(people,(p)-> true);
		System.out.println("################################");
		
		//* Print all people with last name beginning with A
		printLastNameBeginningWithA(people);
		System.out.println("################################");
		printConditionally(people, (p)->p.getLastName().startsWith("C"));
		System.out.println("################################");
		printConditionallyUsingPredicate(people, (p)->p.getLastName().startsWith("A"));		

}

static void printAll(List<Person> l){
	for(Person p : l) {
		System.out.println(p);
	}
}

static void printLastNameBeginningWithA(List<Person> l){
	for(Person p : l) {
		if(p.getLastName().startsWith("A")){
			System.out.println(p);
		}	
	}
}	

static void printConditionally(List<Person> l, Condition c){
	for(Person p : l) {
		if(c.test(p)){
			System.out.println(p);
		}	
	}
}

static void printConditionallyUsingPredicate(List<Person> l, Predicate<Person> predicate){
	for(Person p : l) {
		if(predicate.test(p)){
			System.out.println(p);
		}	
	}
}

}
	
