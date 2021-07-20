package com.bang.operator;

public class CompareOperatorTest {
	public static void main(String[] args) {
//		int number01 = 10;
//		int number02 = 20;
		
//		int number01 = 10;
//		int number02 = 10;
		
		int number01 = 20;
		int number02 = 10;

		boolean compereResult01 = (number01 == number02);
		boolean compereResult02 = (number01 != number02);
		boolean compereResult03 = (number01 > number02);
		boolean compereResult04 = (number01 < number02);
		boolean compereResult05 = (number01 >= number02);
		boolean compereResult06 = (number01 <= number02);

		System.out.println("compareResult01 == value is [" + compereResult01 + "]");
		System.out.println("compareResult02 == value is [" + compereResult02 + "]");
		System.out.println("compareResult03 == value is [" + compereResult03 + "]");
		System.out.println("compareResult04 == value is [" + compereResult04 + "]");
		System.out.println("compareResult05 == value is [" + compereResult05 + "]");
		System.out.println("compareResult06 == value is [" + compereResult06 + "]");

	}
}
