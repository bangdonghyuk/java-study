package com.bang.condition;

public class SwitchCharTest {
	public static void main(String[] args) {
//		char alphabet = 'A';	
		char alphabet = 'B';	
//		char alphabet = 'C';	
//		char alphabet = 'D';	
//		char alphabet = 'a';	
		switch (alphabet) {
		case 'A':
			System.out.println("alphabet is " + alphabet);
			break;
		case 'B':
			System.out.println("alphabet is " + alphabet);
			break;
		case 'C':
			System.out.println("alphabet is " + alphabet);
			break;
		default:
			System.out.println("alphabet is D~Z");
			break;
		}

	}

}
