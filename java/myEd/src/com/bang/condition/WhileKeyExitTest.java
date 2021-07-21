package com.bang.condition;

import java.io.IOException;

public class WhileKeyExitTest {
	public static void main(String[] args) throws Exception {
		boolean isRun = true;
		int KeyCode = 0;

		while (isRun) {
			KeyCode = System.in.read(); // 1키를 입력 받습니다.

			if (KeyCode == 49) {
				
				isRun = false;
				
			} else {
				System.out.println("KeyCode value is " + KeyCode);
			}
		}

		System.out.println("Program is End...");
	}
}
