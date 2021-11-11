package com.loggar.dto;

public class DtoBeforeRecordKeyword {
	public static void main(String args[]) {
		Pet myPet = new Pet("Sheba", 10);

		System.out.println(String.format("My pet %s is aged %s", myPet.getName(), myPet.getAge()));
	}
}

class Pet {
	String name;
	Integer age;

	public Pet(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public Integer getAge() {
		return this.age;
	}
}