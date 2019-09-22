package com.lambdaExamples3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.lambdaExamples.Person;

public class MethodReferenceExample2 {

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
		System.out.println("Printing all people");
		//* performConditionally(people,(p)-> true,(p)-> System.out.println(p));
		performConditionally(people,(p)-> true,System.out::println); // p->method(p)
		/*
		 * How does the println method above know that its supposed to take in an argument
		 * Is because its taking the place of the consumer which takes in an argument
		 */

}

static void performConditionally(List<Person> l, Predicate<Person> predicate, Consumer<Person> consumer){
	for(Person p : l) {
		if(predicate.test(p)){
			consumer.accept(p);
		}	
	}
}

}
	
