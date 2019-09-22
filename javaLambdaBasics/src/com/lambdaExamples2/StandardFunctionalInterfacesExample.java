package com.lambdaExamples2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.lambdaExamples.Person;

public class StandardFunctionalInterfacesExample {

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
		performConditionally(people,(p)-> true,(p)-> System.out.println(p));
		
		//* Print all people with last name beginning with C
		System.out.println("Printing all people with last name beginning with C");
		performConditionally(people, (p)->p.getLastName().startsWith("C"),(p)-> System.out.println(p));
		
		System.out.println("Printing first names beginning with A");
		performConditionally(people, (p)->p.getFirstName().startsWith("A"),(p)-> System.out.println(p.getFirstName()));

}

static void performConditionally(List<Person> l, Predicate<Person> predicate, Consumer<Person> consumer){
	for(Person p : l) {
		if(predicate.test(p)){
			consumer.accept(p);
		}	
	}
}

}
	
