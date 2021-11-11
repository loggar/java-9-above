package com.loggar.dto;

public class DtoWithRecordKeyword {
	public static void main(String args[]) {
		Pet2 myPet = new Pet2("Sheba", 10);

		System.out.println(String.format("My pet %s is aged %s", myPet.name(), myPet.age()));
	}
}

// record class Pet2
// immutable
// cannot extend record classes
record Pet2(String name, Integer age) {
}