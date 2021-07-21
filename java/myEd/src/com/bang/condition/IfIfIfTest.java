package com.bang.condition;

public class IfIfIfTest {
	public static void main(String[] args) {
		char gubun = 'F';
		int age = 20;
		boolean join = false;

		if (gubun == 'F') {
			if (age == 20) {
				System.out.println("Femail.. age is 20");

				if (join) {
					System.out.println("Female.. age is 20 join true");
				} else {
					System.out.println("Female.. age is 20 join false");
				}
				
			} else {
				System.out.println("Female.. age is not 20");
			}

		} else if (gubun == 'M') {
			System.out.println("male");
		} else {
			System.out.println("unknown case...");
		}

	}
}
