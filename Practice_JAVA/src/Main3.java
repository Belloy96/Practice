package com.belloy.jun.main;

public class Main3 {
	public static void main(String[] args) {
		int max = 5000;
		int[] num = new int[max];
		
		// 제네레이터 있는 숫자 -> 1
		for (int i = 1; i < max; i++) {
			int n = i;
			int dn = n;
			
			// dn구하기
			while (n != 0) {
				dn += n % 10;
				n /= 10;
			}
			// 5000 미만에서 dn값을 배열에서 1로 지정(=> 제네레이터가 있음)
			if (dn < max) {
				num[dn] = 1;
			}
		}
		
		// 제네레이터 1을 제외하고 0의 값이 나오는 수가 셀프넘버
		int sum = 0;
		for (int i = 1; i < max; i++) {
			if (num[i] == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
//  어떤 자연수 n에 대해
//	d(n)을 n의 각 자릿수 숫자들과 n 자신을 더한 숫자라고 정의하자.
//	d(91) = 9 + 1 + 91 = 101
//	이 때, n을 d(n)의 제네레이터라고 한다.
//	위의 예에서 91은 101의 제네레이터이다.
//	제네레이터가 없는 숫자들을 self-number라고 하는데 
//	1이상 5000미만의 모든 셀프 넘버들의 합을 구하시오
		
//	입력 없음
//	출력 1227365
	}
}	
	