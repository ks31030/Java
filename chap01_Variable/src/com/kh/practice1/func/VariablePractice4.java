package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		str = sc.next();
		str.charAt(0); // ���۸��� �п���� ������ �޾�����, ��� �� �ƴ϶� ���ذ� ���� �ʽ��ϴ�.
		System.out.println("ù��° ���� : " + str.charAt(0));
		str.charAt(1);
		System.out.println("�ι�° ���� : " + str.charAt(1));
		str.charAt(2);
		System.out.println("����° ���� : " + str.charAt(2));
	}

}