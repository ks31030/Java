package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("문자열을 입력하세요 : ");
		str = sc.next();
		str.charAt(0); // 구글링과 학우들의 도움을 받았으나, 배운 게 아니라서 이해가 가지 않습니다.
		System.out.println("첫번째 문자 : " + str.charAt(0));
		str.charAt(1);
		System.out.println("두번째 문자 : " + str.charAt(1));
		str.charAt(2);
		System.out.println("세번째 문자 : " + str.charAt(2));
	}

}
