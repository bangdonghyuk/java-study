package com.bang.datatype;

public class CastingTest {
	public static void main(String args[]) {

		System.out.println("CastingTest");

		char inValue = 'дв';
		int outResult = inValue;
		System.out.println("дв to int value is [" + outResult + "]");

		int inValue02 = 12594;
		char outResult02 = (char) inValue02;
		System.out.println("12594 to char value is [" + outResult02 + "]");
	}
}
