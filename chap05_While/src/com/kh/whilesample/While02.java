package com.kh.whilesample;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		boolean isChoice = false;
		
		while(!isChoice) { // !�� ����Ͽ� true�� ǥ��
			System.out.println("������ �������ּ���.");
			
			int month = sc.nextInt();
			
			switch(month) {
				case 1: case 2: case 12: //case 3�� �� �ϳ��� ���̶�� ���.
					System.out.println("�ܿ�");
					System.out.println("�ܿ��� ���.");
					isChoice = true;
					//�� !�� ���� ��� ���� �������� ����ǰ�,
					//������ ������ ����Ǳ� ������ true�� �ۼ��ؼ�
					//!�� ���� false�� ������ while���� �������ش�.
					break; //break�� case������ �����ϰ��� �ϴ� �� ����� �� �ѹ��� ����Ѵ�.
				case 3: case 4: case 5:
					System.out.println("��");
					isChoice = true;
					break;
				case 6: case 7: case 8:
					System.out.println("����");
					isChoice = true;
					break;
				case 9: case 10: case 11:
					System.out.println("����");
					isChoice = true;
					break;
				default :
					System.out.println(month + "���̶�� ���� �����.");
			}
		}*/
		boolean isChoice = false;
		
		while(!isChoice) {
			System.out.println("���̰��� ���� �� Ȯ�����ּ���.");
			System.out.println("");
			System.out.println("���̸� �������ּ���.");
			
			int age = sc.nextInt();
			
			switch(age) {
			
			case 10: case 11: case 12: case 13:
				System.out.println("����Դϴ�.");
				isChoice = true;
				break;
				
			case 19: case 20:
				System.out.println("�����Դϴ�.");
				isChoice = true;
				break;
				
			case 14: case 15: case 16: case 17: case 18:
				System.out.println("û�ҳ��Դϴ�.");
				isChoice = true;
				break;
				
			default :
				System.out.println("�ٽ� �Է����ּ���.");
				System.out.println("");
			}
			
		}
	}

}