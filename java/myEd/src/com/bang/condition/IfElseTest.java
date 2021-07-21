package com.bang.condition;

public class IfElseTest {
	public static void main(String[] args) {
		int jungSuAge = 10;

		if (jungSuAge > 5 && jungSuAge == 10) {
			System.out.println("jungSuAhe is > 5");
		} else if (jungSuAge == 10) {
			System.out.println("jungSuAge is 4");
		} else { // 위의두 조건을 제외한 모든 경우를 처리 합니다.
			System.out.println("jungSuAge is <= 5");
		}
	}
}
