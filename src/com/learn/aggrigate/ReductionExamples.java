package com.learn.aggrigate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ReductionExamples {
	public static void main(String[] args) {
		List<Person> person = Arrays.asList(new Person(1,35,"vamshi",Sex.MALE),
				new Person(2,35,"Neela",Sex.MALE),
				new Person(1,40,"krishna",Sex.MALE));
		//find person average age
		Double avg = person.stream().mapToInt(Person::getAge).average().getAsDouble();
		System.out.println(avg);
		//find person total age
		int totalAge = person.stream().mapToInt(Person::getAge).sum();
		System.out.println(totalAge);
		int redAge = person.stream().mapToInt(Person::getAge).reduce(0, (a,b)->a+b);
		System.out.println(redAge);
		Collection<Integer> ps = person.stream()
			    .filter(p -> p.getName().equals("vamshi"))
			    .map(Person::getAge)
			    .collect(Collectors.toCollection(TreeSet::new));
			                   
		System.out.println(ps);
		Map<Sex, List<String>> namesByGender =
			    person.stream().collect(Collectors.groupingBy(Person::getGender,Collectors.mapping(
			                    Person::getName,
			                    Collectors.toList())));
		System.out.println(namesByGender);
	}

}
