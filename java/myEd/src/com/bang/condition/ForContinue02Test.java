package com.bang.condition;

public class ForContinue02Test {
	public static void main(String[] agrs) {
		for (int i = 0; i < 11; i++) {
			if (i % 2 != 0) { // �������� �ִ�. 2�� �����ڿ� ������ ���� 0 �� �ƴ϶� ���� ����.
				continue; // ���⼭ �Ʒ��� �̵����� �ʰ� �ٽ� ���ǹ��� Ÿ�� �˴ϴ�.
			}
			if (i != 0) { // 0�� ¦���� �ƴմϴ�.
				System.out.println(i); // ¦���� ����մϴ�.
			}
		}
	}
}
