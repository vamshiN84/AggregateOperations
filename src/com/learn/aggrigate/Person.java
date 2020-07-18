package com.learn.aggrigate;

public class Person {
	
	private int id;
	private int age;
	private String name;
	Sex gender;
	
	public Person(int id, int age, String name, Sex gender) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Sex getGender() {
		return gender;
	}
	public void setGender(Sex gender) {
		this.gender = gender;
	}
	

}
