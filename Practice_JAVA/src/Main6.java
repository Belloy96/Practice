package com.belloy.jun.main;

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 (0-99): ");
		int num = k.nextInt();
		
		// 입력 숫자를 저장할 변수
		int originalNum = num;
		int cycle = 0;

		do {
			cycle++;

			// 각 자리 숫자를 더함
			int num_10 = num / 10;
			int num_1 = num % 10;
			int sum = num_10 + num_1;
			
			// 새로운 숫자를 만듦
			num = (num_1 * 10) + (sum % 10);

			// 현재 단계의 숫자를 출력함
			System.out.println("단계 " + cycle + ": " + num);

		} while (num != originalNum); // 원래 숫자로 돌아올 때까지 반복

		// 사이클 길이를 출력함
		System.out.println("사이클 길이: " + cycle);
	}
}
