package com.bang.operator;

public class LogicOperatorTest {
	public static void main(String[] args) {
//		boolean isOnTv = true;
//		boolean isOnRadio = true;
//		
//		boolean isOnTv = true;
//		boolean isOnRadio = false;
//		
//		boolean isOnTv = false;
//		boolean isOnRadio = true;
//		
		boolean isOnTv = false;
		boolean isOnRadio = false;

		if (!isOnTv && !isOnRadio) { // ���� �ǿ����ڸ� �˻��Ͽ� false�� ���� �����ڸ� �˻����� �ʽ��ϴ�. ȿ�����̹Ƿ� �ǹ����� �̰��� ���� ���Դϴ�.
//		if (isOnTv == true && isOnRadio == true) {
			System.out.println("AND(&&) is true..isOnTv isOnRadio");
			System.out.println("isOnTv value is " + isOnTv);
			System.out.println("isONRadio value is " + isOnRadio);
		} else {
			System.out.println("AND(&&) the others case...");
			System.out.println("isOnTv value is " + isOnTv);
			System.out.println("isONRadio value is " + isOnRadio);
		}

		System.out.println("==================================");

		if (isOnTv & isOnRadio) { // �ǿ����� 2���� ��� �˻��մϴ�. (��ȿ�������� �ǹ����� �� ������ �ʽ��ϴ�.)
			System.out.println("AND(&) is true..isOnTv isOnRadio");
			System.out.println("isOnTv value is " + isOnTv);
			System.out.println("isONRadio value is " + isOnRadio);
		} else {
			System.out.println("AND(&) the others case...");
			System.out.println("isOnTv value is " + isOnTv);
			System.out.println("isONRadio value is " + isOnRadio);
		}
	}
}
