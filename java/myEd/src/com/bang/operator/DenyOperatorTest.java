package com.bang.operator;

public class DenyOperatorTest {
	public static void main(String[] args) {
		boolean isOnTV = true;
		System.out.println("inOnTv value is " + isOnTV);

//		isOnTV = !isOnTV;

		System.out.println("isOnTV value is " + isOnTV);
		
	
		if (!isOnTV) {
			System.out.println("TV is Off");
		} else {
			System.out.println("TV is On");
		}
		
	}
}
