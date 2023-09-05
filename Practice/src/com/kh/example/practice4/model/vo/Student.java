package com.kh.example.practice4.model.vo;
/*
 - grade : int
- classroom : int
- name : String
- height : double
- gender : char
+ Student()
+ information() : void
 
 */
public class Student {
	
	//1. 멤버 변수
	
	int grade;
	int classroom;
	String name;
	double height;
	char gender;
	
	//2. 생성자
	public Student(int grade, int classroom, String name, double height, char gender) {
		//초기화 블록을 이용해 각 필드 초기화 초기화블록{}
		{
		 grade = 1;
		 classroom = 2;
		 name = "박성철";
		 height = 180.5;
		 gender = '남';
		}
	}
	//3. 출력 메서드 + information() : void
	public void information() {
		 System.out.println("학년 : " + grade);
		 System.out.println("반 : " + classroom);
		 System.out.println("이름 : " + name);
		 System.out.println("키 : " + height);
		 System.out.println("성별 : " + gender);
	}

}
