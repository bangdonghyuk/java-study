package com.bang.condition;

public class ForContinueTest {
	public static void main(String[] agrs) {
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) { // �������� ����. 2�γ����� ��������. ¦��
				continue; // ���⼭ �Ʒ��� �̵����� �ʰ� �ٽ� ���ǹ��� Ÿ�� �˴ϴ�.
			}
			System.out.println(i); // Ȧ���� ����մϴ�.
		}
	}
}