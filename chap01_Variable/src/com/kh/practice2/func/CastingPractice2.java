package com.kh.practice2.func;

import java.util.*;

public class CastingPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double grd1, grd2, grd3;
		
		System.out.print("국어 : ");
		grd1 = sc.nextDouble();
		
		System.out.print("영어 : ");
		grd2 = sc.nextDouble();
		
		System.out.print("수학 : ");
		grd3 = sc.nextDouble();
		
		double dall = (grd1 + grd2 + grd3);
		int iall = (int) dall;
		int iall2 = iall/3;
		System.out.println("총점 : " + iall);
		System.out.print("평균 : " + iall2);
		
		//돌아가긴 돌아 갑니다만, 도대체 총점과 평균을 정수형으로 어떻게 처리해야 할까요. 강사님?
	}

}
