package com.learn.aggrigate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class AggrigateOperations {

	public static void main(String[] args) {
		
		List<Person> person = Arrays.asList(new Person(1,35,"Kranthi",Sex.FEMALE),
				new Person(2,35,"Neela",Sex.MALE),
				new Person(1,35,"Advitha",Sex.FEMALE),
				new Person(1,35,"Asrith",Sex.MALE));
		Double d = person.stream().mapToInt(Person::getAge).average().getAsDouble();
		System.out.println(d);
		int t = person.stream().mapToInt(Person::getAge).sum();
		System.out.println(t);
		Map<Sex, List<String>> mp= person.stream().collect(Collectors.groupingBy(Person::getGender,Collectors.mapping(
                Person::getName,
                Collectors.toList())));
		
System.out.println(mp);
	}

}
