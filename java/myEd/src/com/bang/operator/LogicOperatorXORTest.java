package com.bang.operator;

 public class LogicOperatorXORTest {
	public static void main(String[] args) {
		boolean isOnPc = true;
		boolean isOnPhone = true;

		if (isOnPc ^ isOnPhone) { // �ǿ����� �ΰ��� �ϳ��� true, �ϳ��� false�� �Ǿ�� true�� ��ȯ �մϴ�.
			System.out.println("XOR(^) is true..isOnPc isOnPhone");
			System.out.println("isOnPc value is " + isOnPc);
			System.out.println("isOnPhone value is " + isOnPhone);
		} else {
			System.out.println("XOR(^) the others case...");
			System.out.println("isOnPc value is " + isOnPc);
			System.out.println("isOnPhone value is " + isOnPhone);
		}

	}

}