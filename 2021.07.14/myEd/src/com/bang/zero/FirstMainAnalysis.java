package com.bang.zero; // ��Ű��(�ٷ���)�� ���

public class FirstMainAnalysis { // Ŭ������ ����
	public static void main (String[] args) { // ���� �޼ҵ��� ����
		System.out.println("FirstMainAnalysis is Start"); // �ý��ۿ��� ��� ���ο� �ٷ� ����Ʈ �϶�. ln(Line New) ������ ���� ':'�� �ݾ��ش�.
	
		System.out.println(args[0].toString());// �޾ƿ� ������ �迭 ù��° ���� ���.
		
		for (int i = 0; i < args.length; i++) { // �������� ���� Ȯ��
			System.out.println(args[i].toString());
		}
	} // ���� �޼ҵ��� ��
} // Ŭ������ ��
