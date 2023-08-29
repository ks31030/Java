package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char name1;
		System.out.print("¹®ÀÚ : ");
		name1 = sc.nextChar();
		System.out.println(name1 + " unicode : ");
		int iname1 = (int) name1;
		System.out.println(iname1);
		
		
	}

}
