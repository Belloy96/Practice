package com.belloy.jun.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("N 입력 : ");
		int N = k.nextInt();

		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			System.out.print("A 배열 입력 : ");
			A[i] = k.nextInt();
		}
		
		Integer[] B = new Integer[N];
		for (int i = 0; i < N; i++) {
			System.out.print("B 배열 입력 : ");
			B[i] = k.nextInt();
		}

		Arrays.sort(A);
		Arrays.sort(B, Collections.reverseOrder()); // Collections.reversOrder을 쓰기 위해서 B에 Integer사용
													// 	-> Comparator를 반환하는 메서드이기 때문
													//		-> 기본형 배열에는 사용 X, 객체 배열 필요
		int S = 0;
		for (int i = 0; i < N; i++) {
			S += A[i] * B[i];
		}
		
		System.out.println("최솟값 : " + S);
	}
}
