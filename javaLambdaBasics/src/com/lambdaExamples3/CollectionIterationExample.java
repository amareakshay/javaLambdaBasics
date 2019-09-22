package com.lambdaExamples3;

import java.util.Arrays;
import java.util.List;

import com.lambdaExamples.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				  new Person("Akshay","Amare",29),
				  new Person("Arun","Amare",63),
				  new Person("Seema","Amare",55),
				  new Person("Prachi","Amberkar",33),
				  new Person("Test","Ceylon",33)
				);
		
		System.out.println("Printing using For loop");
		for (int i=0;i < people.size();i++) {
			System.out.println(people.get(i));
		}
		
		System.out.println("Printing using For each loop");
		for (Person p : people) {
			System.out.println(p);
		}
		/*
		 * The above two methods of iterating are external iterations
		 * We are controlling the iterations here, ie we mention when to start and what condition
		 * to use and when to end
		 * 
		 * Now below we will see java 8 way of iterating via internal iterator
		 * The below is called internal iterating as we dont control the iteration
		 * 
		 */
		
		System.out.println("Printing using java 8 for each which takes in a consumer as argument");
		people.forEach(System.out::println);
		

	}

}
