package com.bang.datatype;

public class CharTest {
	public static void main(String[] args) {
		char ch1 = 'a'; //���ڸ� ���� ����
		char ch2 = 97; //10������ ����
		char ch3 = '\u0061'; //16������ ����
		
		char ch01 = '��';
		char ch02 = 44057;
		char ch03 = '\uAC08';
		
	
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		
		System.out.println(ch01);
		System.out.println(ch02);
		System.out.println(ch03);
		
		int unCode = ch01;
		System.out.println(unCode);
		
	}
}
