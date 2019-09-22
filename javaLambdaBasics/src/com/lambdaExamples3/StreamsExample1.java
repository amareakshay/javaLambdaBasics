package com.lambdaExamples3;

import java.util.Arrays;
import java.util.List;

import com.lambdaExamples.Person;

public class StreamsExample1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				  new Person("Akshay","Amare",29),
				  new Person("Arun","Amare",63),
				  new Person("Seema","Amare",55),
				  new Person("Prachi","Amberkar",33),
				  new Person("Test","Ceylon",33)
				);
		people.stream().filter(p-> p.getFirstName().startsWith("A"))
		.forEach(p->System.out.println(p.getFirstName()));

		long count=people.stream().filter(p-> p.getFirstName().startsWith("A")).count();
		
		System.out.println("Count="+count);
		
		/*
		 * For a large collection, we can split the stream into multiple strem and process them
		 * in parallel using multiple cores and thus expedite the process
		 */
		
		long parallelCount=people.parallelStream().filter(p-> p.getFirstName().startsWith("A")).count();
		System.out.println("Parallel Count="+parallelCount);
	}

}
