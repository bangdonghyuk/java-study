package com.bang.condition;

public class IfScoreTest {
	public static void main(String[] args) {
		int score = 70;
		char grade = 'X';

		if (score == 90) {
//			System.out.println("A");
			grade = 'A';
		} else if (score == 80) {
//			System.out.println("B");
			grade = 'B';
		} else if (score == 70) {
//			System.out.println("C");
			grade = 'C';
		} else {
//			System.out.println("D");
			grade = 'D';
		}

		System.out.println(grade);
	}
}
