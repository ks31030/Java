package com.kh.practice3.func;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.�Է�");
		System.out.println("2.����");
		System.out.println("3.��ȸ");
		System.out.println("4.����");
		System.out.println("7.����");
		int choice;
		choice = sc.nextInt();
		
		/*if (choice==1) {
			System.out.println("�Է¸޴��Դϴ�.");
		} else if (choice==2) {
			System.out.println("�����޴��Դϴ�.");
		} else if (choice==3) {
			System.out.println("��ȸ�޴��Դϴ�.");
		} else if (choice==4) {
			System.out.println("�����޴��Դϴ�.");
		} else if(choice==7){
			System.out.println("���α׷��� ����˴ϴ�.");
		}
		*/
		switch(choice) {
			case 1:
				System.out.println("�Է�");
			break;	
			case 2:
				System.out.println("����");
				break;	
			case 3:
				System.out.println("��ȸ");
				break;	
			case 4:
				System.out.println("����");
				break;	
			case 7:
				System.out.println("����");
				break;	
			default :
				System.out.println("�߸� �Էµ� ��ȣ�Դϴ�.");
		}
	}

}