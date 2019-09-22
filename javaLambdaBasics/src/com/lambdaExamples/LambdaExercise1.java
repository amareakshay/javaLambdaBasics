package com.lambdaExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExercise1 {

	public static void main(String[] args) {
			List<Person> people = Arrays.asList(
					  new Person("Akshay","Amare",29),
					  new Person("Arun","Amare",63),
					  new Person("Seema","Amare",55),
					  new Person("Prachi","Amberkar",33),
					  new Person("Test","Ceylon",33)
					);
			
			//* Sort List by Last name
			
			Collections.sort(people,new Comparator<Person>() {
				@Override
				public int compare(Person p1, Person p2) {
					return p1.getLastName().compareTo(p2.getLastName());	
				}
			});
			
			//* Print all the elements in that list 
			printAll(people);
			System.out.println("################################");
			
			//* Print all people with last name beginning with A
			printLastNameBeginningWithA(people);
			System.out.println("################################");
			printConditionally(people, new Condition() {
				@Override
				public boolean test (Person p) {
					return p.getLastName().startsWith("C");
				}
			});

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
}
