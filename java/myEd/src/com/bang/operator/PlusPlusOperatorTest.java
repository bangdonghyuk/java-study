package com.bang.operator;

public class PlusPlusOperatorTest {
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		int result = ++x + 1; // 먼저 x를 증가시키고 연산합니다.
		int result2 = y++ + 1; // 연산을 먼저하고 그 다음에 y를 증가시킵니다.

		System.out.println("result value is " + result);
		System.out.println("result2 value is " + result2);

		System.out.println("-----------");

		System.out.println("x value is " + x);

		System.out.println("y value is " + y);

	}
}
