package com.belloy.jun.main;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("단어를 입력하세요 (최대 100글자, 소문자 알파벳, -, = 만 사용 가능):");
        String input = scanner.nextLine();
        
        if (input.length() > 100) {
            System.out.println("입력된 단어가 너무 깁니다.");
            return;
        }
        
        // 크로아티아 알파벳 배열
        String[] croatianAlphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        // 크로아티아 알파벳 개수를 세는 변수
        int count = 0;
        
        // 입력된 단어에서 크로아티아 알파벳을 찾고 개수 세기
        for (String croatianAlphabet : croatianAlphabets) {
            while (input.contains(croatianAlphabet)) {
                input = input.replaceFirst(croatianAlphabet, " ");
                count++;
            }
        }
        
        // 나머지 단어의 길이를 더함
        count += input.replace(" ", "").length();
        
        System.out.println("크로아티아 알파벳 포함 단어의 총 문자 개수: " + count);
    }
}