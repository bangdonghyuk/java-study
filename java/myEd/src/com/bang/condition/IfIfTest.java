package com.bang.condition;

public class IfIfTest {
	public static void main(String[] args) {
		char gubun = 'X'; // M: male, F: Female
		int age = 20;

		if (gubun == 'F') {
			if (age == 20) {
				System.out.println("Female.. age is 20");
			} else {
				System.out.println("Female.. age is not 20");
			}

		} else if (gubun == 'M') {
			System.out.println("male");
		} else {
			System.out.println("unknown case...");
			System.out.println("gubun value is ![" + gubun + "]");
		}
	}
}
