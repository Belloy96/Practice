package com.belloy.jun.main;

import java.util.Random;

public class Main1 {
	public static void main(String[] args) {
//두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고, 
//눈의 합이 5가 아니면 계속 주사위를 던지고, 
//눈의 합이 5이면 실행을 멈추는 코드를 작성하시오. 
		Random r = new Random();
		int turn = 0;
		while (true) {
			int result1 = r.nextInt(6) + 1;
			int result2 = r.nextInt(6) + 1;
			turn += 1;
			System.out.printf("%d번째 주사위 2개를 굴립니다..\n", turn);
			System.out.printf("주사위의 값은 %d, %d\n", result1, result2);
			int sum = result1 + result2;
			if (sum == 5) {
				System.out.printf("합이 5이므로 종료!\n%d번째 시도에 성공!\n", turn);
				System.out.println("---------------------");
				break;
			} else {
				System.out.printf("합은 %d, 합이 5가 아니므로 다시!\n", sum);
				System.out.println("---------------------");
			}
		}
	}
}
