package com.belloy.jun.main;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) throws InterruptedException {
		int money = 100000;
		int powerade = 3750;
		int pocari = 2970;
		int water = 1770;
		int count = 0;
		Scanner k = new Scanner(System.in);

		while (true) {
			System.out.println("1. 상품구매 | 2. 남은 돈 변환 | 3. 종료");
			System.out.print("번호 입력 : ");
			int choice = k.nextInt();
			System.out.println("==============================");

			if (choice == 1) {
				System.out.println("1. 파워에이드(3750원) / 2. 포카리(2970원) / 3. 물(1770원)");

				System.out.print("구매할 품목의 번호 입력 : ");
				int choiceBeverage = k.nextInt();
				if (choiceBeverage == 1) {
					choiceBeverage = 3750;
				} else if (choiceBeverage == 2) {
					choiceBeverage = 2970;
				} else if (choiceBeverage == 3) {
					choiceBeverage = 1770;
				}

				System.out.print("구매할 품목의 수량 입력 : ");
				int beverageQuantity = k.nextInt();
				System.out.println("==============================");
				int price = choiceBeverage * beverageQuantity;
				System.out.printf("지불금액 : %d\n거스름돈 : %d\n", price, (money - price));
				money -= price;
				System.out.println("==============================");
			} else if (choice == 2) {
				System.out.println("<거스름돈 : " + money + "원>");
				int[] currency = { 50000, 10000, 5000, 500, 100, 50, 10 };
				for (int i = 0; i < currency.length; i++) {
					if (money >= currency[i]) {
						System.out.printf("%d원권 : %d개\n", currency[i], (money / currency[i]));
						money %= currency[i];
					}
				}
				System.out.println("==============================");
			} else if (choice == 3) {
				System.out.println("자판기가 종료됩니다.");
				Thread.sleep(3000);
				break;
			}
		}
	}
}
